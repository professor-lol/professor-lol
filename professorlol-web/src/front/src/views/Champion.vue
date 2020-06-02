<template>
  <div class=" bg-black">
    <b-row class="ml-12" width="100%">
      <img :src="championData.image" class="col-3">
      <b-col class="col-9 champion-info-box">
        <h3 class="text-white">라이즈</h3>
        <table class="table-small text-white">
          <tbody>
          <tr>
            <th scope="col">체력</th>
            <th scope="col">{{stat_data.hp}} <span style="color:yellow">(+{{stat_data.hpPerLevel}})</span>
            </th>
            <th scope="col">마나</th>
            <th scope="col">{{stat_data.mp}} <span style="color:yellow">(+{{stat_data.mpPerLevel}})</span>
            </th>
          </tr>
          <tr>
            <th scope="col">공격</th>
            <th scope="col">{{stat_data.attackDamage}} <span
                    style="color:yellow">(+{{stat_data.attackDamagePerLevel}})</span>
            </th>
            <th scope="col">공격 속도</th>
            <th scope="col">{{stat_data.attackSpeed}} <span
                    style="color:yellow">(+{{stat_data.attackSpeedPerLevel}})</span>
            </th>
          </tr>
          <tr>
            <th scope="col">5초당 체력회복</th>
            <th scope="col">{{stat_data.hpRegen}} <span
                    style="color:yellow">(+{{stat_data.hpRegenPerLevel}})</span></th>
            <th scope="col">5초당 마력회복</th>
            <th scope="col">{{stat_data.mpRegen}} <span
                    style="color:yellow">(+{{stat_data.mpRegenPerLevel}})</span></th>
          </tr>
          <tr>
            <th scope="col">방어력</th>
            <th scope="col">{{stat_data.armor}} <span style="color:yellow">(+{{stat_data.attackDamagePerLevel}})</span>
            </th>
            <th scope="col">마법 저항력</th>
            <th scope="col">{{stat_data.spellBlock}} <span
                    style="color:yellow">(+{{stat_data.spellBlockPerLevel}})</span>
            </th>
          </tr>
          <tr>
            <th scope="col">이동 속도</th>
            <th scope="col">{{stat_data.moveSpeed}}</th>
            <th scope="col">사정 거리</th>
            <th scope="col">{{stat_data.attackRange}}</th>
          </tr>
          </tbody>
        </table>
      </b-col>
    </b-row>
  </div>
</template>

<script>

  export default {
    name: "Champion.vue",
    computed: {
      championData() {
        return this.$store.state.lol_info;
      },
      stat_data() {
        return this.$store.state.lol_info.statResDto[0];
      }
    },
    methods: {}
  }
</script>

<style scoped>
  .champion-info-box {
    padding: 20px;
  }

  .table-small {
    width: 100%;
    margin-top: 1rem;
    /*color: white;*/
    font-size: 12px;
    background-color: black;
  }

  .table-small th {
    padding: 6px;

  }

  .bg-black {
    background-color: black;
  }

</style>
