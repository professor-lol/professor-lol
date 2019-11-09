<template>
  <v-app>
    <core-ui/>
  </v-app>
</template>

<script>
  export default {
    components: {
      CoreUi: () => import ('@coreui/vue')
    }
  }
</script>
