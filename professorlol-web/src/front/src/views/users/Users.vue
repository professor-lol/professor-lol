<template>
  <b-row>
    <b-col cols="12" xl="6">
      <transition name="slide">
        <b-card>
          <div slot="header" v-html="caption"></div>
          <b-table :bordered="bordered" :current-page="currentPage" :fields="fields" :fixed="fixed" :hover="hover"
                   :items="items" :per-page="perPage" :small="small" :striped="striped" @row-clicked="rowClicked"
                   responsive="sm">
            <template slot="id" slot-scope="data">
              <strong>{{data.item.id}}</strong>
            </template>
            <template slot="name" slot-scope="data">
              <strong>{{data.item.name}}</strong>
            </template>
            <template slot="status" slot-scope="data">
              <b-badge :variant="getBadge(data.item.status)">{{data.item.status}}</b-badge>
            </template>
          </b-table>
          <nav>
            <b-pagination :per-page="perPage" :total-rows="getRowCount(items)" hide-goto-end-buttons next-text="Next"
                          prev-text="Prev" size="sm" v-model="currentPage"/>
          </nav>
        </b-card>
      </transition>
    </b-col>
  </b-row>
</template>

<script>
  import usersData from './UsersData'

  export default {
    name: 'Users',
    props: {
      caption: {
        type: String,
        default: 'Users'
      },
      hover: {
        type: Boolean,
        default: true
      },
      striped: {
        type: Boolean,
        default: true
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
      }
    },
    data: () => {
      return {
        items: usersData.filter((user) => user.id < 42),
        fields: [
          {key: 'id'},
          {key: 'name'},
          {key: 'registered'},
          {key: 'role'},
          {key: 'status'}
        ],
        currentPage: 1,
        perPage: 5,
        totalRows: 0
      }
    },
    computed: {},
    methods: {
      getBadge(status) {
        return status === 'Active' ? 'success'
          : status === 'Inactive' ? 'secondary'
            : status === 'Pending' ? 'warning'
              : status === 'Banned' ? 'danger' : 'primary'
      },
      getRowCount(items) {
        return items.length
      },
      userLink(id) {
        return `users/${id.toString()}`
      },
      rowClicked(item) {
        const userLink = this.userLink(item.id)
        this.$router.push({path: userLink})
      }

    }
  }
</script>

<style scoped>
  .card-body >>> table > tbody > tr > td {
    cursor: pointer;
  }
</style>
