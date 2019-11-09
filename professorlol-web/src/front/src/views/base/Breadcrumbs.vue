<template>
  <div class="wrapper">
    <div class="animated fadeIn">
      <b-row>
        <b-col cols="12">
          <b-card
            footer-tag="footer"
            header-tag="header">
            <div slot="header">
              <i class="fa fa-align-justify"></i><strong> Bootstrap Breadcrumb</strong>
              <div class="card-header-actions">
                <a class="card-header-action" href="https://bootstrap-vue.js.org/docs/components/breadcrumb"
                   rel="noreferrer noopener" target="_blank">
                  <small class="text-muted">docs</small>
                </a>
              </div>
            </div>
            <b-breadcrumb :items="items"/>
          </b-card>
        </b-col>
      </b-row>
    </div>
  </div>
</template>

<script>
  export default {
    name: 'breadcrumbs',
    data() {
      return {
        items: [{
          text: 'Admin',
          href: '#'
        }, {
          text: 'Manage',
          href: '#'
        }, {
          text: 'Library',
          active: true
        }]
      }
    }
  }
</script>
