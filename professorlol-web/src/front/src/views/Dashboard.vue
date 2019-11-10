<template>
  <div class="animated fadeIn">
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

  export default {
    name: 'dashboard',
    components: {
      PatchNoteBlockVer,
      ReadingRecord
    },
    data: function () {
      return {
        selected: 'Month',
        tableItems: [
          {
            avatar: {url: 'img/avatars/1.jpg', status: 'success'},
            user: {name: 'Yiorgos Avraamu', new: true, registered: 'Jan 1, 2015'},
            country: {name: 'USA', flag: 'us'},
            usage: {value: 50, period: 'Jun 11, 2015 - Jul 10, 2015'},
            payment: {name: 'Mastercard', icon: 'fa fa-cc-mastercard'},
            activity: '10 sec ago'
          },
          {
            avatar: {url: 'img/avatars/2.jpg', status: 'danger'},
            user: {name: 'Avram Tarasios', new: false, registered: 'Jan 1, 2015'},
            country: {name: 'Brazil', flag: 'br'},
            usage: {value: 22, period: 'Jun 11, 2015 - Jul 10, 2015'},
            payment: {name: 'Visa', icon: 'fa fa-cc-visa'},
            activity: '5 minutes ago'
          },
          {
            avatar: {url: 'img/avatars/3.jpg', status: 'warning'},
            user: {name: 'Quintin Ed', new: true, registered: 'Jan 1, 2015'},
            country: {name: 'India', flag: 'in'},
            usage: {value: 74, period: 'Jun 11, 2015 - Jul 10, 2015'},
            payment: {name: 'Stripe', icon: 'fa fa-cc-stripe'},
            activity: '1 hour ago'
          },
          {
            avatar: {url: 'img/avatars/4.jpg', status: ''},
            user: {name: 'Enéas Kwadwo', new: true, registered: 'Jan 1, 2015'},
            country: {name: 'France', flag: 'fr'},
            usage: {value: 98, period: 'Jun 11, 2015 - Jul 10, 2015'},
            payment: {name: 'PayPal', icon: 'fa fa-paypal'},
            activity: 'Last month'
          },
          {
            avatar: {url: 'img/avatars/5.jpg', status: 'success'},
            user: {name: 'Agapetus Tadeáš', new: true, registered: 'Jan 1, 2015'},
            country: {name: 'Spain', flag: 'es'},
            usage: {value: 22, period: 'Jun 11, 2015 - Jul 10, 2015'},
            payment: {name: 'Google Wallet', icon: 'fa fa-google-wallet'},
            activity: 'Last week'
          },
          {
            avatar: {url: 'img/avatars/6.jpg', status: 'danger'},
            user: {name: 'Friderik Dávid', new: true, registered: 'Jan 1, 2015'},
            country: {name: 'Poland', flag: 'pl'},
            usage: {value: 43, period: 'Jun 11, 2015 - Jul 10, 2015'},
            payment: {name: 'Amex', icon: 'fa fa-cc-amex'},
            activity: 'Last week'
          }
        ],
        tableFields: {
          avatar: {
            label: '<i class="icon-people"></i>',
            class: 'text-center'
          },
          user: {
            label: 'User'
          },
          country: {
            label: 'Country',
            class: 'text-center'
          },
          usage: {
            label: 'Usage'
          },
          payment: {
            label: 'Payment method',
            class: 'text-center'
          },
          activity: {
            label: 'Activity'
          }
        }
      }
    },
    methods: {
      variant(value) {
        let $variant
        if (value <= 25) {
          $variant = 'info'
        } else if (value > 25 && value <= 50) {
          $variant = 'success'
        } else if (value > 50 && value <= 75) {
          $variant = 'warning'
        } else if (value > 75 && value <= 100) {
          $variant = 'danger'
        }
        return $variant
      },
      flag(value) {
        return 'flag-icon flag-icon-' + value
      }
    }
  }
</script>

<style>
  /* IE fix */
  #card-chart-01, #card-chart-02 {
    width: 100% !important;
  }
</style>
