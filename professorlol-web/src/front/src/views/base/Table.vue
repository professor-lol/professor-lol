<template>
  <b-card>
    <div slot="header" v-html="caption"></div>
    <b-table :bordered="bordered" :current-page="currentPage" :dark="dark" :fields="captions" :fixed="fixed"
             :hover="hover" :items="items" :per-page="perPage" :small="small" :striped="striped"
             @row-clicked="rowClicked" responsive="sm">
      <template slot="status" slot-scope="data">
        <b-badge :variant="getBadge(data.item.status)">{{data.item.status}}</b-badge>
      </template>
    </b-table>
    <nav>
      <b-pagination :per-page="perPage" :total-rows="totalRows" hide-goto-end-buttons next-text="Next" prev-text="Prev"
                    v-model="currentPage"/>
    </nav>
  </b-card>
</template>

<script>


  export default {
    name: 'c-table',
    inheritAttrs: false,
    props: {
      caption: {
        type: String,
        default: 'Table'
      },
      hover: {
        type: Boolean,
        default: false
      },
      striped: {
        type: Boolean,
        default: false
      },
      bordered: {
        type: Boolean,
        default: false
      },
      small: {
        type: Boolean,
        default: false
      },
      fixed: {
        type: Boolean,
        default: false
      },
      tableData: {
        type: [Array, Function],
        default: () => []
      },
      fields: {
        type: [Array, Object],
        default: () => []
      },
      perPage: {
        type: Number,
        default: 5
      },
      dark: {
        type: Boolean,
        default: false
      }
    },
    data: () => {
      return {
        currentPage: 1,
      }
    },
    computed: {
      items: function () {
        const items = this.tableData
        return Array.isArray(items) ? items : items()
      },
      totalRows: function () {
        return this.getRowCount()
      },
      captions: function () {
        return this.fields
      }
    },
    methods: {
      getBadge(status) {
        return status === 'Active' ? 'success'
          : status === 'Inactive' ? 'secondary'
            : status === 'Pending' ? 'warning'
              : status === 'Banned' ? 'danger' : 'primary'
      },
      getRowCount: function () {
        return this.items.length
      },
      rowClicked(item) {
        this.$emit('row-clicked', item)
      }
    }
  }
</script>
