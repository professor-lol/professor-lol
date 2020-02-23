<template>
  <div class="animated fadeIn">
    <br/>
    <champion class="border-double"/>
    <br/>
    <patch-note-block-ver/>
    <reading-record/>
    <patch-note-block-ver/>
    <patch-note-block-ver/>
    <patch-note-block-ver/>
  </div>
</template>

<script>

  import PatchNoteBlockVer from './PatchNoteBlockVer'
  import ReadingRecord from './ReadingRecord'
  import Champion from "./Champion";

  export default {
    created() {
      this.$store.commit('viewLolInfo');
      this.$store.commit('viewPatchNote', '1');
    },
    name: 'dashboard',
    components: {
      PatchNoteBlockVer,
      ReadingRecord,
      Champion
    },
  }
</script>

<style>
  .border-double {
    border: double;
  }
</style>
