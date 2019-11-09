<template>
  <div class="wrapper">
    <div class="animated fadeIn">
      <b-row>
        <b-col lg="9" md="12">
          <b-card
            footer-tag="footer"
            header-tag="header">
            <div slot="header">
              <i class="fa fa-align-justify"></i><strong> Bootstrap Carousel</strong>
              <div class="card-header-actions">
                <a class="card-header-action" href="https://bootstrap-vue.js.org/docs/components/carousel"
                   rel="noreferrer noopener" target="_blank">
                  <small class="text-muted">docs</small>
                </a>
              </div>
            </div>
            <div>
              <b-carousel :interval="4000"
                          @sliding-end="onSlideEnd"
                          @sliding-start="onSlideStart"
                          background="#ababab"
                          controls
                          id="carousel1"
                          img-height="480"
                          img-width="1024"
                          indicators
                          style="text-shadow: 1px 1px 2px #333;"
                          v-model="slide"
              >

                <!-- Text slides with image -->
                <b-carousel-slide caption="First slide"
                                  img-src="https://lorempixel.com/1024/480/technics/2/"
                                  text="Nulla vitae elit libero, a pharetra augue mollis interdum."
                ></b-carousel-slide>

                <!-- Slides with custom text -->
                <b-carousel-slide img-src="https://lorempixel.com/1024/480/technics/4/">
                  <h1>Hello world!</h1>
                </b-carousel-slide>

                <!-- Slides with image only -->
                <b-carousel-slide img-src="https://lorempixel.com/1024/480/technics/8/">
                </b-carousel-slide>

                <!-- Slides with img slot -->
                <!-- Note the classes .d-block and .img-fluid to prevent browser default image alignment -->
                <b-carousel-slide>
                  <img alt="image slot" class="d-block img-fluid w-100" height="480" slot="img"
                       src="https://lorempixel.com/1024/480/technics/5/" width="1024">
                </b-carousel-slide>

                <!-- Slide with blank fluid image to maintain slide aspect ratio -->
                <b-carousel-slide caption="Blank Image" img-alt="Blank image" img-blank>
                  <p>
                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse
                    eros felis, tincidunt a tincidunt eget, convallis vel est. Ut pellentesque
                    ut lacus vel interdum.
                  </p>
                </b-carousel-slide>

              </b-carousel>

              <p class="mt-4">
                Slide #: {{ slide }}<br>
                Sliding: {{ sliding }}
              </p>

            </div>
          </b-card>
        </b-col>
      </b-row>
    </div>
  </div>
</template>

<script>
  export default {
    name: 'carousels',
    data() {
      return {
        slide: 0,
        sliding: null
      }
    },
    methods: {
      onSlideStart(slide) {
        console.log('onSlideStart', slide)
        this.sliding = true
      },
      onSlideEnd(slide) {
        console.log('onSlideEnd', slide)
        this.sliding = false
      }
    }
  }
</script>
