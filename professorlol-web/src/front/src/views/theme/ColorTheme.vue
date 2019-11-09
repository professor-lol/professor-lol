<template>
  <b-col class="mb-4" md="4" sm="6" xl="2" xs="12">
    <div :class="[classObj, color]" :style="{ paddingTop: '75%' }"></div>
    <slot></slot>
    <color-view/>
  </b-col>
</template>

<script>
  import ColorView from './ColorView'

  export default {
    name: 'ColorTheme',
    components: {ColorView},
    props: {
      classObj: {
        type: String,
        default: 'theme-color w-75 rounded mb-3'
      },
      color: {
        type: String,
        default: 'bg-secondary'
      }
    }
  }
</script>

