<template>
  <AppHeaderDropdown no-caret right>
    <template slot="header">
      <img
        alt="admin@bootstrapmaster.com"
        class="img-avatar"
        src="img/avatars/6.jpg"/>
    </template>
    \
    <template slot="dropdown">
      <b-dropdown-header class="text-center" tag="div"><strong>Account</strong></b-dropdown-header>
      <b-dropdown-item><i class="fa fa-bell-o"/> Updates
        <b-badge variant="info">{{ itemsCount }}</b-badge>
      </b-dropdown-item>
      <b-dropdown-item><i class="fa fa-envelope-o"/> Messages
        <b-badge variant="success">{{ itemsCount }}</b-badge>
      </b-dropdown-item>
      <b-dropdown-item><i class="fa fa-tasks"/> Tasks
        <b-badge variant="danger">{{ itemsCount }}</b-badge>
      </b-dropdown-item>
      <b-dropdown-item><i class="fa fa-comments"/> Comments
        <b-badge variant="warning">{{ itemsCount }}</b-badge>
      </b-dropdown-item>
      <b-dropdown-header
        class="text-center"
        tag="div">
        <strong>Settings</strong>
      </b-dropdown-header>
      <b-dropdown-item><i class="fa fa-user"/> Profile</b-dropdown-item>
      <b-dropdown-item><i class="fa fa-wrench"/> Settings</b-dropdown-item>
      <b-dropdown-item><i class="fa fa-usd"/> Payments
        <b-badge variant="secondary">{{ itemsCount }}</b-badge>
      </b-dropdown-item>
      <b-dropdown-item><i class="fa fa-file"/> Projects
        <b-badge variant="primary">{{ itemsCount }}</b-badge>
      </b-dropdown-item>
      <b-dropdown-divider/>
      <b-dropdown-item><i class="fa fa-shield"/> Lock Account</b-dropdown-item>
      <b-dropdown-item><i class="fa fa-lock"/> Logout</b-dropdown-item>
    </template>
  </AppHeaderDropdown>
</template>

<script>
  import {HeaderDropdown as AppHeaderDropdown} from '@coreui/vue'

  export default {
    name: 'DefaultHeaderDropdownAccnt',
    components: {
      AppHeaderDropdown
    },
    data: () => {
      return {itemsCount: 42}
    }
  }
</script>
