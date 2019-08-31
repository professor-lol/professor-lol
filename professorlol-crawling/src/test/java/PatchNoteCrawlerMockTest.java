import com.css.professorlol.PatchNoteCrawler;
import com.css.professorlol.PatchNoteCrawlerImpl;
import com.css.professorlol.domain.champion.Champion;
import org.apache.commons.io.IOUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockserver.client.MockServerClient;
import org.mockserver.integration.ClientAndServer;
import support.RiotMockProperties;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;

public class PatchNoteCrawlerMockTest {

    private ClientAndServer clientAndServer;

    @Before
    public void startMockServer() throws IOException {
        clientAndServer = ClientAndServer.startClientAndServer(RiotMockProperties.PORT);
    }

    @After
    public void tearDown() throws Exception {
        clientAndServer.stop();
    }

    @Test
    public void 패치노트__크롤링하면_챔피언_리스트반환() throws IOException {
        //given
        final Long id = 1L;
        RiotMockProperties riotMockProperties = new RiotMockProperties();
        byte[] response = IOUtils.toByteArray(getClass().getClassLoader().getResourceAsStream("com/css/professorlol/PatchNote_9_12.html"));
        createPatchNoteServer(id, response);

        //when
        PatchNoteCrawler patchNoteCrawler = new PatchNoteCrawlerImpl(riotMockProperties);
        List<Champion> champions = patchNoteCrawler.getChampionPatchById(id);

        //then
        assertEquals("모데카이저", champions.get(0).getName());
        assertEquals("강철의 망령", champions.get(0).getSummary());
        assertEquals("죽은 자의 세상에서 귀환한 멈출 수 없는 돌격형 전사인 모데카이저가 9.12 패치에서 산 자의 세상을 정복하기 위한 준비를 마쳤습니다! 업데이트된 모데카이저와 다양한 스킨의 고화질 일러스트를 LoL 디스플레이에서도 감상해 보세요!",
                champions.get(0).getContext());
        assertEquals("./PatchNote_9_12_files/image(1)", champions.get(0).getImage());

    }

    private void createPatchNoteServer(Long noteId, byte[] response) {
        new MockServerClient("localhost", RiotMockProperties.PORT)
                .when(
                        request()
                                .withMethod("GET")
                                .withQueryStringParameter(String.format(PatchNoteCrawlerImpl.PATCH_NOTE_QUERY, noteId))
                )
                .respond(
                        response()
                                .withStatusCode(200)
                                .withBody(response)
                );
    }

}
