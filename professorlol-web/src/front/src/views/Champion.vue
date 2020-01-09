<template>
  <div class=" bg-black">
    <b-row class="ml-12" width="100%">
      <img :src="mock_json.image" class="col-3">
      <b-col class="col-9 champion-info-box">
        <h3 class="text-white">라이즈</h3>
        <table class="table-small text-white">
          <tbody>
          <tr>
            <th scope="col">체력</th>
            <th scope="col">{{stat_mock_json.hp}} <span style="color:yellow">(+{{stat_mock_json.hpPerLevel}})</span>
            </th>
            <th scope="col">마나</th>
            <th scope="col">{{stat_mock_json.mp}} <span style="color:yellow">(+{{stat_mock_json.mpPerLevel}})</span>
            </th>
          </tr>
          <tr>
            <th scope="col">공격</th>
            <th scope="col">{{stat_mock_json.attackDamage}} <span style="color:yellow">(+{{stat_mock_json.attackDamagePerLevel}})</span>
            </th>
            <th scope="col">공격 속도</th>
            <th scope="col">{{stat_mock_json.attackSpeed}} <span style="color:yellow">(+{{stat_mock_json.attackSpeedPerLevel}})</span>
            </th>
          </tr>
          <tr>
            <th scope="col">5초당 체력회복</th>
            <th scope="col">{{stat_mock_json.hpRegen}} <span
              style="color:yellow">(+{{stat_mock_json.hpRegenPerLevel}})</span></th>
            <th scope="col">5초당 마력회복</th>
            <th scope="col">{{stat_mock_json.mpRegen}} <span
              style="color:yellow">(+{{stat_mock_json.mpRegenPerLevel}})</span></th>
          </tr>
          <tr>
            <th scope="col">방어력</th>
            <th scope="col">{{stat_mock_json.armor}} <span style="color:yellow">(+{{stat_mock_json.attackDamagePerLevel}})</span>
            </th>
            <th scope="col">마법 저항력</th>
            <th scope="col">{{stat_mock_json.spellBlock}} <span style="color:yellow">(+{{stat_mock_json.spellBlockPerLevel}})</span>
            </th>
          </tr>
          <tr>
            <th scope="col">이동 속도</th>
            <th scope="col">{{stat_mock_json.moveSpeed}}</th>
            <th scope="col">사정 거리</th>
            <th scope="col">{{stat_mock_json.attackRange}}</th>
          </tr>
          </tbody>
        </table>
      </b-col>
    </b-row>
  </div>
</template>

<script>
  import mock from "../../mockData/lolinfo_champion_res";

  export default {
    name: "Champion.vue",
    computed: {
      mock_json() {
        return mock;
      },
      stat_mock_json() {
        return mock.statResDto[0];
      }
    },
    methods: {}
  }
</script>

<style scoped>
  .champion-info-box {
    padding: 20px;
  }

  .table-small {
    width: 100%;
    margin-top: 1rem;
    /*color: white;*/
    font-size: 12px;
    background-color: black;
  }

  .table-small th {
    padding: 6px;

  }

  .bg-black {
    background-color: black;
  }

</style>
