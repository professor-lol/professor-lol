<template>
  <div class="animated fadeIn">
    <b-row>
      <b-col md="4" sm="6">
        <b-card header="Card title">
          Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet
          dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper
          suscipit lobortis nisl ut aliquip ex ea commodo consequat.
        </b-card>
      </b-col>
      <b-col md="4" sm="6">
        <b-card show-footer>
          Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet
          dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper
          suscipit lobortis nisl ut aliquip ex ea commodo consequat.
          <div slot="footer">Card footer</div>
        </b-card>
      </b-col>
      <b-col md="4" sm="6">
        <b-card>
          <div slot="header"><i class='fa fa-check'></i> Card with icon</div>
          Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet
          dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper
          suscipit lobortis nisl ut aliquip ex ea commodo consequat.
        </b-card>
      </b-col>
      <b-col md="4" sm="6">
        <b-card>
          <div slot="header">
            Card with switch
            <div class="card-header-actions" style="height: 21px;">
              <c-switch checked color="info" label size="sm"/>
            </div>
          </div>
          Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet
          dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper
          suscipit lobortis nisl ut aliquip ex ea commodo consequat.
        </b-card>
      </b-col>
      <b-col md="4" sm="6">
        <b-card>
          <div slot="header">
            Card with label
            <div class="card-header-actions">
              <b-badge variant="success">Success</b-badge>
            </div>
          </div>
          Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet
          dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper
          suscipit lobortis nisl ut aliquip ex ea commodo consequat.
        </b-card>
      </b-col>
      <b-col md="4" sm="6">
        <b-card>
          <div slot="header">
            Card with label
            <div class="card-header-actions">
              <b-badge pill variant="danger">42</b-badge>
            </div>
          </div>
          Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet
          dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper
          suscipit lobortis nisl ut aliquip ex ea commodo consequat.
        </b-card>
      </b-col>
    </b-row><!--/.row-->
    <b-row>
      <b-col md="4" sm="6">
        <b-card border-variant="primary" header="Card outline primary">
          Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet
          dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper
          suscipit lobortis nisl ut aliquip ex ea commodo consequat.
        </b-card>
      </b-col>
      <b-col md="4" sm="6">
        <b-card border-variant="secondary" header="Card outline secondary">
          Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet
          dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper
          suscipit lobortis nisl ut aliquip ex ea commodo consequat.
        </b-card>
      </b-col>
      <b-col md="4" sm="6">
        <b-card border-variant="success" header="Card outline success">
          Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet
          dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper
          suscipit lobortis nisl ut aliquip ex ea commodo consequat.
        </b-card>
      </b-col>
      <b-col md="4" sm="6">
        <b-card border-variant="info" header="Card outline info">
          Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet
          dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper
          suscipit lobortis nisl ut aliquip ex ea commodo consequat.
        </b-card>
      </b-col>
      <b-col md="4" sm="6">
        <b-card border-variant="warning" header="Card outline warning">
          Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet
          dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper
          suscipit lobortis nisl ut aliquip ex ea commodo consequat.
        </b-card>
      </b-col>
      <b-col md="4" sm="6">
        <b-card border-variant="danger" header="Card outline danger">
          Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet
          dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper
          suscipit lobortis nisl ut aliquip ex ea commodo consequat.
        </b-card>
      </b-col>
    </b-row><!--/.row-->

    <b-row>
      <b-col md="4" sm="6">
        <b-card class="card-accent-primary" header="Card with primary accent">
          Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet
          dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper
          suscipit lobortis nisl ut aliquip ex ea commodo consequat.
        </b-card>
      </b-col>
      <b-col md="4" sm="6">
        <b-card class="card-accent-secondary" header="Card with secondary accent">
          Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet
          dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper
          suscipit lobortis nisl ut aliquip ex ea commodo consequat.
        </b-card>
      </b-col>
      <b-col md="4" sm="6">
        <b-card class="card-accent-success" header="Card with success accent">
          Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet
          dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper
          suscipit lobortis nisl ut aliquip ex ea commodo consequat.
        </b-card>
      </b-col>
      <b-col md="4" sm="6">
        <b-card class="card-accent-info" header="Card with info accent">
          Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet
          dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper
          suscipit lobortis nisl ut aliquip ex ea commodo consequat.
        </b-card>
      </b-col>
      <b-col md="4" sm="6">
        <b-card class="card-accent-warning" header="Card with warning accent">
          Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet
          dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper
          suscipit lobortis nisl ut aliquip ex ea commodo consequat.
        </b-card>
      </b-col>
      <b-col md="4" sm="6">
        <b-card class="card-accent-danger" header="Card with danger accent">
          Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet
          dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper
          suscipit lobortis nisl ut aliquip ex ea commodo consequat.
        </b-card>
      </b-col>
    </b-row><!--/.row-->
    <b-row>
      <b-col md="4" sm="6">
        <b-card class="bg-primary text-center">
          <blockquote class="card-blockquote">
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p>
            <footer>Someone famous in
              <cite title="Source Title">Source Title</cite>
            </footer>
          </blockquote>
        </b-card>
      </b-col>
      <b-col md="4" sm="6">
        <b-card class="bg-success text-center">
          <blockquote class="card-blockquote">
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p>
            <footer>Someone famous in
              <cite title="Source Title">Source Title</cite>
            </footer>
          </blockquote>
        </b-card>
      </b-col>
      <b-col md="4" sm="6">
        <b-card class="bg-info text-center">
          <blockquote class="card-blockquote">
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p>
            <footer>Someone famous in
              <cite title="Source Title">Source Title</cite>
            </footer>
          </blockquote>
        </b-card>
      </b-col>
      <b-col md="4" sm="6">
        <b-card class="bg-warning text-center">
          <blockquote class="card-blockquote">
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p>
            <footer>Someone famous in
              <cite title="Source Title">Source Title</cite>
            </footer>
          </blockquote>
        </b-card>
      </b-col>
      <b-col md="4" sm="6">
        <b-card class="bg-danger text-center">
          <blockquote class="card-blockquote">
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p>
            <footer>Someone famous in
              <cite title="Source Title">Source Title</cite>
            </footer>
          </blockquote>
        </b-card>
      </b-col>
      <b-col md="4" sm="6">
        <b-card class="bg-secondary text-center">
          <blockquote class="card-blockquote">
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p>
            <footer>Someone famous in
              <cite title="Source Title">Source Title</cite>
            </footer>
          </blockquote>
        </b-card>
      </b-col>
    </b-row><!--/.row-->
    <b-row>
      <b-col md="4" sm="6">
        <b-card class="bg-primary" header="Card title">
          Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet
          dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper
          suscipit lobortis nisl ut aliquip ex ea commodo consequat.
        </b-card>
      </b-col>
      <b-col md="4" sm="6">
        <b-card class="bg-success" header="Card title">
          Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet
          dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper
          suscipit lobortis nisl ut aliquip ex ea commodo consequat.
        </b-card>
      </b-col>
      <b-col md="4" sm="6">
        <b-card class="bg-info" header="Card title">
          Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet
          dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper
          suscipit lobortis nisl ut aliquip ex ea commodo consequat.
        </b-card>
      </b-col>
      <b-col md="4" sm="6">
        <b-card class="bg-warning" header="Card title">
          Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet
          dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper
          suscipit lobortis nisl ut aliquip ex ea commodo consequat.
        </b-card>
      </b-col>
      <b-col md="4" sm="6">
        <b-card class="bg-danger" header="Card title">
          Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet
          dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper
          suscipit lobortis nisl ut aliquip ex ea commodo consequat.
        </b-card>
      </b-col>
      <b-col md="4" sm="6">
        <transition name="fade">
          <b-card class="bg-secondary" no-body v-if="show">
            <div slot="header">
              Card with header actions
              <div class="card-header-actions">
                <b-link class="card-header-action btn-setting" href="#">
                  <i class="icon-settings"></i>
                </b-link>
                <b-link class="card-header-action btn-minimize" v-b-toggle.collapse1>
                  <i class="icon-arrow-up"></i>
                </b-link>
                <b-link class="card-header-action btn-close" href="#" v-on:click="show = !show">
                  <i class="icon-close"></i>
                </b-link>
              </div>
            </div>
            <b-collapse id="collapse1" visible>
              <b-card-body>
                Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut
                laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation
                ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.
              </b-card-body>
            </b-collapse>
          </b-card>
        </transition>
      </b-col>
    </b-row><!--/.row-->
  </div>
</template>

<script>
  import {Switch as cSwitch} from '@coreui/vue'

  export default {
    name: 'cards',
    components: {
      cSwitch
    },
    data: function () {
      return {
        show: true
      }
    }
  }
</script>

<style scoped>
  .fade-enter-active {
    transition: all .3s ease;
  }

  .fade-leave-active {
    transition: all .8s cubic-bezier(1.0, 0.5, 0.8, 1.0);
  }

  .fade-enter, .fade-leave-to {
    transform: translateX(10px);
    opacity: 0;
  }
</style>
