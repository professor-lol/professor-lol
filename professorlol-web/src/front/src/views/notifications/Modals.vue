<template>
  <div class="wrapper">
    <div class="animated fadeIn">
      <b-row>
        <b-col cols="12">
          <b-card>
            <div slot="header"><i class='fa fa-align-justify'></i> Bootstrap Modals</div>
            <b-button @click="myModal = true" class="mr-1" type="button" variant="secondary">Launch demo modal
            </b-button>
            <b-button @click="largeModal = true" class="mr-1" type="button" variant="secondary">Launch large modal
            </b-button>
            <b-button @click="smallModal = true" class="mr-1" type="button" variant="secondary">Launch small modal
            </b-button>
            <hr>
            <b-button @click="primaryModal = true" class="mr-1" type="button" variant="primary">Launch primary modal
            </b-button>
            <b-button @click="successModal = true" class="mr-1" type="button" variant="success">Launch success modal
            </b-button>
            <b-button @click="warningModal = true" class="mr-1" type="button" variant="warning">Launch warning modal
            </b-button>
            <b-button @click="dangerModal = true" class="mr-1" type="button" variant="danger">Launch danger modal
            </b-button>
            <b-button @click="infoModal = true" class="mr-1" type="button" variant="info">Launch info modal</b-button>
          </b-card>
        </b-col><!--/.col-->
      </b-row><!--/.row-->
    </div>

    <!-- Modal Component -->
    <b-modal @ok="myModal = false" title="Modal title" v-model="myModal">
      Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
      tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
      quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
      consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
      cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
      proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
    </b-modal>
    <b-modal @ok="largeModal = false" size="lg" title="Modal title" v-model="largeModal">
      Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
      tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
      quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
      consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
      cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
      proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
    </b-modal>
    <b-modal @ok="smallModal = false" size="sm" title="Modal title" v-model="smallModal">
      Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
      tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
      quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
      consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
      cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
      proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
    </b-modal>


    <b-modal
      @ok="primaryModal = false"
      content-class="border-primary"
      header-bg-variant="primary"
      title="Modal title"
      v-model="primaryModal"
      variant="primary"
    >
      Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
      tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
      quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
      consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
      cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
      proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
    </b-modal>
    <b-modal
      @ok="successModal = false"
      content-class="border-success"
      header-bg-variant="success"
      ok-variant="success"
      title="Modal title"
      v-model="successModal"
      variant="success"
    >
      Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
      tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
      quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
      consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
      cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
      proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
    </b-modal>
    <b-modal
      @ok="warningModal = false"
      content-class="border-warning"
      header-bg-variant="warning"
      ok-variant="warning"
      title="Modal title"
      v-model="warningModal"
      variant="warning"
    >
      Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
      tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
      quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
      consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
      cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
      proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
    </b-modal>
    <b-modal
      @ok="dangerModal = false"
      content-class="border-danger"
      header-bg-variant="danger"
      ok-variant="danger"
      title="Modal title"
      v-model="dangerModal"
      variant="danger"
    >
      Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
      tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
      quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
      consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
      cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
      proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
    </b-modal>
    <b-modal
      @ok="infoModal = false"
      content-class="border-info"
      header-bg-variant="info"
      ok-variant="info"
      title="Modal title"
      v-model="infoModal"
      variant="info"
    >
      Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
      tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
      quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
      consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
      cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
      proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
    </b-modal>
  </div>

</template>

<script>
  export default {
    name: 'modals',
    data() {
      return {
        myModal: false,
        largeModal: false,
        smallModal: false,
        primaryModal: false,
        successModal: false,
        warningModal: false,
        dangerModal: false,
        infoModal: false
      }
    }
  }
</script>
