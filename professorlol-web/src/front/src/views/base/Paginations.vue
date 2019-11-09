<template>
  <div class="wrapper">
    <div class="animated fadeIn">
      <b-card
        footer-tag="footer"
        header-tag="header">
        <div slot="header">
          <i class="fa fa-align-justify"></i><strong> Bootstrap Pagination</strong>
          <div class="card-header-actions">
            <a class="card-header-action" href="https://bootstrap-vue.js.org/docs/components/pagination"
               rel="noreferrer noopener" target="_blank">
              <small class="text-muted">docs</small>
            </a>
          </div>
        </div>
        <div>
          <h6>Default</h6>
          <b-pagination :per-page="10" :total-rows="100" size="md" v-model="currentPage">
          </b-pagination>
          <br>

          <h6>Small</h6>
          <b-pagination :per-page="10" :total-rows="100" size="sm" v-model="currentPage">
          </b-pagination>
          <br>

          <div class="d-sm-down-none">
            <h6>Large</h6>
            <b-pagination :per-page="10" :total-rows="100" size="lg" v-model="currentPage">
            </b-pagination>
            <br>
          </div>

          <div>currentPage: {{currentPage}}</div>
        </div>
      </b-card>
      <b-card
        footer-tag="footer"
        header-tag="header">
        <div slot="header">
          <i class="fa fa-align-justify"></i><strong> Pagination </strong>
          <small>alignment</small>
        </div>
        <div>
          <h6>Left alignment (default)</h6>
          <b-pagination :per-page="10" :total-rows="100" v-model="currentPage">
          </b-pagination>
          <br>

          <h6>Center alignment</h6>
          <b-pagination :per-page="10" :total-rows="100" align="center" v-model="currentPage">
          </b-pagination>
          <br>

          <h6>Right (end) alignment</h6>
          <b-pagination :per-page="10" :total-rows="100" align="right" v-model="currentPage">
          </b-pagination>
          <br>

          <div>currentPage: {{currentPage}}</div>
        </div>
      </b-card>
      <b-card
        footer-tag="footer"
        header-tag="header">
        <div slot="header">
          <i class="fa fa-align-justify"></i><strong> Pagination </strong>
          <small>navigation</small>
        </div>
        <div>
          <h6>Default</h6>
          <b-pagination-nav :number-of-pages="10" base-url="#" v-model="currentPage"/>

          <h6 class="mt-4">With link generator function</h6>
          <b-pagination-nav :link-gen="linkGen" :number-of-pages="10" v-model="currentPage"/>
          <br>

          <div class="mt-4">currentPage: {{currentPage}}</div>
        </div>
      </b-card>
    </div>
  </div>
</template>

<script>
  export default {
    name: 'paginations',
    data() {
      return {
        currentPage: 3
      }
    },
    methods: {
      linkGen(pageNum) {
        return '#page/' + pageNum + '/foobar'
      }
    }
  }
</script>

