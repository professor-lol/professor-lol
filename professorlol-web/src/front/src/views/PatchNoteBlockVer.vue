<template>
  <div class="animated fadeIn">
    <b-row>
      <b-card class="bg-dark">
        <div slot="header">
          <h3><strong> 9.22V </strong></h3>
        </div>
        <div class="list-group list-group-accent">
          <div class="list-group-item text-white bg-dark">{{mock_json.champion_summary}}</div>
          <br/>
          <div class="list-group-item text-gray bg-dark">{{mock_json.champion_context}}</div>
        </div>
        <br/>
        <b-tabs card nav-wrapper-class="w-40" pills v-model="tabIndex[1]" vertical>
            <b-tab active v-for="data in mock_json.skill">
              <template slot="title">
                <img
                  src="https://am-a.akamaihd.net/image?f=https://ddragon.leagueoflegends.com/cdn/9.19.1/img/spell/GarenQ.png&resize=32:"/>
                {{data.name}}
              </template>
              <b-list-group flush>
                <b-list-group-item v-for="attr in data.attribute" href="#">
                  <b-badge class="m-1" :variant="attr.type">{{attr.type}}</b-badge> // TODO
                  {{attr.name}} : {{attr.before ? attr.before + "->" : "" }} {{attr.after}}
                </b-list-group-item>
              </b-list-group>
            </b-tab>
          </b-tabs>
        </b-card>
    </b-row>
  </div>
</template>

<script>
  import mock from '../mock/patch_note_block_ver'
  export default {
    name: 'tabs',
    computed: {
      mock_json() {
        return mock;
      },
    },
    data(){
      return {"tabIndex": [0, 0]}
    },
    methods: {
      variant(value) {
        let $variant;
        console.log(value);
        if (value === "change") {
          $variant = 'success'
        } else if (value === "remove") {
          $variant = 'danger'
        } else if (value === "new") {
          $variant = 'warning'
        }
        return $variant
      }
    }

  }
</script>
