<template>
  <div class="wrapper">
    <div class="animated fadeIn">
      <b-card
        footer-tag="footer"
        header-tag="header">
        <div slot="header">
          <i class="fa fa-align-justify"></i><strong> Bootstrap Popovers</strong>
          <div class="card-header-actions">
            <a class="card-header-action" href="https://bootstrap-vue.js.org/docs/components/popovers"
               rel="noreferrer noopener" target="_blank">
              <small class="text-muted">docs</small>
            </a>
          </div>
        </div>
        <b-row>
          <b-col cols="6">
            <div class="my-3 text-center">
              <b-btn title="Popover Title" v-b-popover.hover="'I am popover content!'">
                Hover Me
              </b-btn>
            </div>
          </b-col>
          <b-col cols="6">
            <div class="my-3 text-center">
              <b-btn id="popoverButton-open" variant="primary">Button</b-btn>

              <b-popover show target="popoverButton-open" title="Popover">
                I start <strong>open</strong>
              </b-popover>
            </div>
          </b-col>
        </b-row>
      </b-card>
      <b-card
        footer-tag="footer"
        header-tag="header">
        <div slot="header">
          <i class="fa fa-align-justify"></i><strong> Popovers </strong>
          <small>placement</small>
        </div>
        <div class="my-3">
          <b-row>
            <b-col :key="placement" class="py-4 text-center"
                   md="4" v-for="placement in placements">
              <b-btn :id="`exPopover1-${placement}`" variant="primary">
                {{ placement }}
              </b-btn>
              <b-popover :content="`Placement ${placement}`"
                         :placement="placement"
                         :target="`exPopover1-${placement}`"
                         title="Popover!"
                         triggers="hover focus">
              </b-popover>
            </b-col>
          </b-row>
        </div>
      </b-card>
      <b-card class="d-sm-down-none"
              footer-tag="footer"
              header-tag="header">
        <div slot="header">
          <i class="fa fa-align-justify"></i><strong> Popovers </strong>
          <small>via properties or slots</small>
        </div>
        <b-row>
          <b-col class="py-4 text-center" md="6">
            <b-btn id="exPopover2" variant="primary">Using properties</b-btn>
            <b-popover content="Embedding content using properties is easy"
                       target="exPopover2"
                       title="Prop Examples"
                       triggers="hover focus">
            </b-popover>
          </b-col>
          <b-col class="py-4 text-center" md="6">
            <b-btn id="exPopover3" variant="primary">Using slots</b-btn>
            <b-popover target="exPopover3" triggers="hover focus">
              <template slot="title">Content via Slots</template>
              Embedding content <span class="text-danger">using slots</span>
              affords you <em>greater <strong>control.</strong></em> and
              basic HTML support.
            </b-popover>
          </b-col>
        </b-row>
      </b-card>
      <b-card
        footer-tag="footer"
        header-tag="header">
        <div slot="header">
          <i class="fa fa-align-justify"></i><strong> Popovers </strong>
          <small>show</small>
        </div>
        <div class="d-flex flex-column text-md-center">
          <div class="p-2">
            <b-btn id="popoverButton-sync" variant="primary">I have a popover</b-btn>
          </div>
          <div class="p-2">
            <b-btn @click="show = !show" class="px-1">Toggle Popover</b-btn>

            <b-popover :show.sync="show" target="popoverButton-sync" title="Popover">
              Hello <strong>World!</strong>
            </b-popover>
          </div>
        </div>
      </b-card>
      <b-card
        footer-tag="footer"
        header-tag="header">
        <div slot="header">
          <i class="fa fa-align-justify"></i><strong> Popover </strong>
          <small>open/close events</small>
        </div>
        <div class="d-flex flex-column text-md-center">
          <div class="p-2">
            <b-btn id="popoverButton-event" variant="primary">I have a popover</b-btn>
          </div>
          <div class="p-2">
            <b-btn @click="onOpen" class="px-1">Open</b-btn>
            <b-btn @click="onClose" class="px-1">Close</b-btn>
          </div>

          <b-popover ref="popover1" target="popoverButton-event" title="Popover">
            Hello <strong>World!</strong>
          </b-popover>
        </div>
      </b-card>
      <b-card
        footer-tag="footer"
        header-tag="header">
        <div slot="header">
          <i class="fa fa-align-justify"></i><strong> Popover </strong>
          <small>enable/disable events</small>
        </div>
        <div class="d-flex flex-column text-md-center">
          <div class="p-2">
            <b-btn id="popoverButton-disableevent" variant="primary">I have a popover</b-btn>
          </div>
          <div class="p-2">
            <b-btn @click="onEnable" class="px-1">Enable</b-btn>
            <b-btn @click="onDisable" class="px-1">Disable</b-btn>
          </div>

          <b-popover ref="popover2" target="popoverButton-disableevent" title="Popover">
            Hello <strong>World!</strong>
          </b-popover>
        </div>
      </b-card>
      <b-card
        footer-tag="footer"
        header-tag="header">
        <div slot="header">
          <i class="fa fa-align-justify"></i><strong> Popover </strong>
          <small><code>v-b-popover</code> directive</small>
        </div>
        <b-row>
          <b-col class="py-3 text-center" md="3">
            <b-btn title="Popover!"
                   v-b-popover.hover.top="'I am Top'"
                   variant="primary">Top
            </b-btn>
          </b-col>
          <b-col class="py-3 text-center" md="3">
            <b-btn title="Popover!"
                   v-b-popover.hover.left="'I am Left'"
                   variant="primary">Left
            </b-btn>
          </b-col>
          <b-col class="py-3 text-center" md="3">
            <b-btn title="Popover!"
                   v-b-popover.hover.right="'I am Right'"
                   variant="primary">Right
            </b-btn>
          </b-col>
          <b-col class="py-3 text-center" md="3">
            <b-btn title="Popover!"
                   v-b-popover.hover.bottom="'I am Bottom'"
                   variant="primary">Bottom
            </b-btn>
          </b-col>
        </b-row>
      </b-card>
    </div>
  </div>
</template>

<script>
  export default {
    name: 'popovers',
    data() {
      return {
        placements: [
          'topright', 'top', 'topleft',
          'bottomright', 'bottom', 'bottomleft',
          'righttop', 'right', 'lefttop',
          'rightbottom', 'left', 'leftbottom'
        ],
        show: false
      }
    },
    methods: {
      onOpen() {
        this.$refs.popover1.$emit('open')
      },
      onClose() {
        this.$refs.popover1.$emit('close')
      },
      onEnable() {
        this.$refs.popover2.$emit('enable')
      },
      onDisable() {
        this.$refs.popover2.$emit('disable')
      }
    }
  }
</script>
