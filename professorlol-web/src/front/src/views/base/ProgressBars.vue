<template>
  <div class="wrapper">
    <div class="animated fadeIn">
      <b-card
        footer-tag="footer"
        header-tag="header">
        <div slot="header">
          <i class="fa fa-align-justify"></i><strong> Bootstrap Progress</strong>
          <div class="card-header-actions">
            <a class="card-header-action" href="https://bootstrap-vue.js.org/docs/components/progress"
               rel="noreferrer noopener" target="_blank">
              <small class="text-muted">docs</small>
            </a>
          </div>
        </div>
        <div>
          <b-progress :max="max" :value="counter" animated show-progress></b-progress>
          <b-progress :max="max" class="mt-1" show-value>
            <b-progress-bar :value="counter*(6/10)" variant="success"></b-progress-bar>
            <b-progress-bar :value="counter*(2.5/10)" variant="warning"></b-progress-bar>
            <b-progress-bar :value="counter*(1.5/10)" variant="danger"></b-progress-bar>
          </b-progress>
          <b-btn @click="clicked" class="mt-4">Click me</b-btn>
        </div>
      </b-card>
      <b-card
        footer-tag="footer"
        header-tag="header">
        <div slot="header">
          <i class="fa fa-align-justify"></i> <strong> Progress </strong>
          <small>labels</small>
        </div>
        <div>
          <h6>No label</h6>
          <b-progress :max="max2" :value="value" class="mb-3"></b-progress>
          <h6>Value label</h6>
          <b-progress :max="max2" :value="value" class="mb-3" show-value></b-progress>
          <h6>Progress label</h6>
          <b-progress :max="max2" :value="value" class="mb-3" show-progress></b-progress>
          <h6>Value label with precision</h6>
          <b-progress :max="max2" :precision="2" :value="value" class="mb-3" show-value></b-progress>
          <h6>Progress label with precision</h6>
          <b-progress :max="max2" :precision="2" :value="value" class="mb-3" show-progress></b-progress>
        </div>
      </b-card>
      <b-card
        footer-tag="footer"
        header-tag="header">
        <div slot="header">
          <i class="fa fa-align-justify"></i><strong> Progress </strong>
          <small>width</small>
        </div>
        <div>
          <h6>Default width</h6>
          <b-progress :value="value3" class="mb-3"></b-progress>
          <h6>Custom widths</h6>
          <b-progress :value="value3" class="w-75 mb-2"></b-progress>
          <b-progress :value="value3" class="w-50 mb-2"></b-progress>
          <b-progress :value="value3" class="w-25"></b-progress>
        </div>
      </b-card>
      <b-card
        footer-tag="footer"
        header-tag="header">
        <div slot="header">
          <i class="fa fa-align-justify"></i><strong> Progress </strong>
          <small>height</small>
        </div>
        <div>
          <h6>Default height</h6>
          <b-progress :value="value3" class="mb-3" show-progress></b-progress>
          <h6>Custom heights</h6>
          <b-progress :value="value3" class="mb-2" height="2rem" show-progress></b-progress>
          <b-progress :value="value3" class="mb-2" height="20px" show-progress></b-progress>
          <b-progress :value="value3" height="2px"></b-progress>
        </div>
      </b-card>
      <b-card
        footer-tag="footer"
        header-tag="header">
        <div slot="header">
          <i class="fa fa-align-justify"></i><strong> Progress </strong>
          <small>variants</small>
        </div>
        <div>
          <div :key="index" class="row mb-1" v-for="(bar, index) in bars">
            <div class="col-sm-2">{{ bar.variant }}:</div>
            <div class="col-sm-10 pt-1">
              <b-progress :key="bar.variant"
                          :value="bar.value"
                          :variant="bar.variant"
              ></b-progress>
            </div>
          </div>
        </div>
      </b-card>
      <b-card
        footer-tag="footer"
        header-tag="header">
        <div slot="header">
          <i class="fa fa-align-justify"></i><strong> Progress </strong>
          <small>striped</small>
        </div>
        <div>
          <b-progress :striped="striped" :value="25" class="mb-2" variant="success"></b-progress>
          <b-progress :striped="striped" :value="50" class="mb-2" variant="info"></b-progress>
          <b-progress :striped="striped" :value="75" class="mb-2" variant="warning"></b-progress>
          <b-progress :striped="striped" :value="100" class="mb-2" variant="danger"></b-progress>
          <b-button @click="striped = !striped" variant="secondary">
            {{ striped ? 'Remove' : 'Add'}} Striped
          </b-button>
        </div>
      </b-card>
      <b-card
        footer-tag="footer"
        header-tag="header">
        <div slot="header">
          <i class="fa fa-align-justify"></i><strong> Progress </strong>
          <small>animated</small>
        </div>
        <div>
          <b-progress :animated="animate" :value="25" class="mb-2" striped variant="success"></b-progress>
          <b-progress :animated="animate" :value="50" class="mb-2" striped variant="info"></b-progress>
          <b-progress :animated="animate" :value="75" class="mb-2" striped variant="warning"></b-progress>
          <b-progress :animated="animate" :value="100" class="mb-3" variant="danger"></b-progress>
          <b-button @click="animate = !animate" variant="secondary">
            {{ animate ? 'Stop' : 'Start'}} Animation
          </b-button>
        </div>
      </b-card>
      <b-card
        footer-tag="footer"
        header-tag="header">
        <div slot="header">
          <i class="fa fa-align-justify"></i><strong> Progress </strong>
          <small>multiple bars</small>
        </div>
        <div>
          <b-progress :max="max3" class="mb-3">
            <b-progress-bar :value="values[0]" variant="primary"></b-progress-bar>
            <b-progress-bar :value="values[1]" variant="success"></b-progress-bar>
            <b-progress-bar :value="values[2]" variant="info"></b-progress-bar>
          </b-progress>
          <b-progress :max="max3" class="mb-3" show-progress>
            <b-progress-bar :value="values[0]" variant="primary"></b-progress-bar>
            <b-progress-bar :value="values[1]" variant="success"></b-progress-bar>
            <b-progress-bar :value="values[2]" variant="info"></b-progress-bar>
          </b-progress>
          <b-progress :max="max3" class="mb-3" show-value striped>
            <b-progress-bar :value="values[0]" variant="primary"></b-progress-bar>
            <b-progress-bar :value="values[1]" variant="success"></b-progress-bar>
            <b-progress-bar :value="values[2]" variant="info"></b-progress-bar>
          </b-progress>
          <b-progress :max="max3" class="mb-3">
            <b-progress-bar :value="values[0]" show-progress variant="primary"></b-progress-bar>
            <b-progress-bar :value="values[1]" animated show-progress variant="success"></b-progress-bar>
            <b-progress-bar :value="values[2]" show-progress striped variant="info"></b-progress-bar>
          </b-progress>
        </div>
      </b-card>
    </div>
  </div>
</template>

<script>
  export default {
    name: 'progress-bars',
    data() {
      return {
        counter: 45,
        max: 100,
        max2: 50,
        value: 33.333333333,
        value3: 75,
        bars: [
          {variant: 'success', value: 75},
          {variant: 'info', value: 75},
          {variant: 'warning', value: 75},
          {variant: 'danger', value: 75},
          {variant: 'primary', value: 75},
          {variant: 'secondary', value: 75},
          {variant: 'dark', value: 75}
        ],
        timer: null,
        striped: true,
        animate: true,
        max3: 100,
        values: [15, 30, 20]
      }
    },
    methods: {
      clicked() {
        this.counter = Math.random() * this.max
        console.log('Change progress to ' +
          Math.round(this.counter * 100) / 100)
      },
      setClock() {
        this.timer = setInterval(() => {
          this.bars.forEach(bar => {
            bar.value = 25 + (Math.random() * 75)
          })
        }, 2000)
      }
    },
    mounted() {
      this.setClock()
    },
    beforeDestroy() {
      clearInterval(this.timer)
      this.timer = null
    }
  }
</script>

