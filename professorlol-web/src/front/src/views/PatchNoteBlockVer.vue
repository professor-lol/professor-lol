<template>
  <div class="animated fadeIn">
    <b-row>
      <b-card class="bg-dark">
        <div slot="header">
          <h3><strong> {{mock_json.patchVersion}} </strong></h3>
        </div>
        <div class="list-group list-group-accent">
          <div class="list-group-item text-white bg-dark">{{mock_json.summary}}</div>
          <div class="list-group-item text-gray bg-dark">{{mock_json.context}}</div>
        </div>
        <br/>
        <b-tabs card nav-wrapper-class="w-40" pills v-model="tabIndex[1]" vertical>
            <b-tab active v-for="data in mock_json.abilityHistoryDto">
              <template slot="title">
                <img :src = "data.image" height="32" width="32"/>
                {{data.skillType !== 'PASSIVE' ? data.skillType + " - " : ""}} {{data.title}}
              </template>
              <b-list-group flush>
                <b-list-group-item v-for="attr in data.attributeHistoryDtos" href="#">
                  <span :class="badgeColor(attr.attributeType)" class="badge badge-pill">{{attr.attributeType}}</span>
                  {{attr.attribute}} : {{attr.beforeContent ? attr.beforeContent + "->" : "" }} {{attr.afterContent}}
                </b-list-group-item>
              </b-list-group>
            </b-tab>
          </b-tabs>
        </b-card>
    </b-row>
  </div>
</template>

<script>
  import mock from '../../mockData/patch_note_block_ver'

  export default {
    name: 'tabs',
    computed: {
      mock_json() {
        return mock;
      },
    },
    data() {
      return {"tabIndex": [0, 0]}
    },
    methods: {
      badgeColor(value) {
        return {
          'badge-success': value === "CHANGE",
          'badge-danger': value === "REMOVE",
          'badge-warning': value === "NEW"
        }
      },
    }
  }
</script>
