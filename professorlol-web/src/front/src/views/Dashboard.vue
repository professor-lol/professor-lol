<template>
  <div class="animated fadeIn">
    <b-row>
      <b-col lg="3" sm="6">
        <b-card class="bg-primary" no-body>
          <b-card-body class="pb-0">
            <b-dropdown class="float-right" right variant="transparent p-0">
              <template slot="button-content">
                <i class="icon-settings"></i>
              </template>
              <b-dropdown-item>Action</b-dropdown-item>
              <b-dropdown-item>Another action</b-dropdown-item>
              <b-dropdown-item>Something else here...</b-dropdown-item>
              <b-dropdown-item disabled>Disabled action</b-dropdown-item>
            </b-dropdown>
            <h4 class="mb-0">9.823</h4>
            <p>Members online</p>
          </b-card-body>
          <card-line1-chart-example :height="70" chartId="card-chart-01" class="chart-wrapper px-3"
                                    style="height:70px;"/>
        </b-card>
      </b-col>
      <b-col lg="3" sm="6">
        <b-card class="bg-info" no-body>
          <b-card-body class="pb-0">
            <b-dropdown class="float-right" no-caret right variant="transparent p-0">
              <template slot="button-content">
                <i class="icon-location-pin"></i>
              </template>
              <b-dropdown-item>Action</b-dropdown-item>
              <b-dropdown-item>Another action</b-dropdown-item>
              <b-dropdown-item>Something else here...</b-dropdown-item>
              <b-dropdown-item disabled>Disabled action</b-dropdown-item>
            </b-dropdown>
            <h4 class="mb-0">9.823</h4>
            <p>Members online</p>
          </b-card-body>
          <card-line2-chart-example :height="70" chartId="card-chart-02" class="chart-wrapper px-3"
                                    style="height:70px;"/>
        </b-card>
      </b-col>
      <b-col lg="3" sm="6">
        <b-card class="bg-warning" no-body>
          <b-card-body class="pb-0">
            <b-dropdown class="float-right" right variant="transparent p-0">
              <template slot="button-content">
                <i class="icon-settings"></i>
              </template>
              <b-dropdown-item>Action</b-dropdown-item>
              <b-dropdown-item>Another action</b-dropdown-item>
              <b-dropdown-item>Something else here...</b-dropdown-item>
              <b-dropdown-item disabled>Disabled action</b-dropdown-item>
            </b-dropdown>
            <h4 class="mb-0">9.823</h4>
            <p>Members online</p>
          </b-card-body>
          <card-line3-chart-example chartId="card-chart-03" class="chart-wrapper" height="70" style="height:70px;"/>
        </b-card>
      </b-col>
      <b-col lg="3" sm="6">
        <b-card class="bg-danger" no-body>
          <b-card-body class="pb-0">
            <b-dropdown class="float-right" right variant="transparent p-0">
              <template slot="button-content">
                <i class="icon-settings"></i>
              </template>
              <b-dropdown-item>Action</b-dropdown-item>
              <b-dropdown-item>Another action</b-dropdown-item>
              <b-dropdown-item>Something else here...</b-dropdown-item>
              <b-dropdown-item disabled>Disabled action</b-dropdown-item>
            </b-dropdown>
            <h4 class="mb-0">9.823</h4>
            <p>Members online</p>
          </b-card-body>
          <card-bar-chart-example chartId="card-chart-04" class="chart-wrapper px-3" height="70" style="height:70px;"/>
        </b-card>
      </b-col>
    </b-row>

    <b-card>
      <b-row>
        <b-col sm="5">
          <h4 class="card-title mb-0" id="traffic">Traffic</h4>
          <div class="small text-muted">November 2017</div>
        </b-col>
        <b-col class="d-none d-md-block" sm="7">
          <b-button class="float-right" type="button" variant="primary"><i class="icon-cloud-download"></i></b-button>
          <b-button-toolbar aria-label="Toolbar with buttons group" class="float-right">
            <b-form-radio-group button-variant="outline-secondary" buttons class="mr-3" id="radiosBtn" name="radiosBtn"
                                v-model="selected">
              <b-form-radio class="mx-0" value="Day">Day</b-form-radio>
              <b-form-radio class="mx-0" value="Month">Month</b-form-radio>
              <b-form-radio class="mx-0" value="Year">Year</b-form-radio>
            </b-form-radio-group>
          </b-button-toolbar>
        </b-col>
      </b-row>
      <main-chart-example chartId="main-chart-01" class="chart-wrapper" height="300"
                          style="height:300px;margin-top:40px;"></main-chart-example>
      <div slot="footer">
        <b-row class="text-center">
          <b-col class="mb-sm-2 mb-0">
            <div class="text-muted">Visits</div>
            <strong>29.703 Users (40%)</strong>
            <b-progress :precision="1" :value="40" class="progress-xs mt-2" height={} variant="success"></b-progress>
          </b-col>
          <b-col class="mb-sm-2 mb-0 d-md-down-none">
            <div class="text-muted">Unique</div>
            <strong>24.093 Users (20%)</strong>
            <b-progress :precision="1" :value="20" class="progress-xs mt-2" height={} variant="info"></b-progress>
          </b-col>
          <b-col class="mb-sm-2 mb-0">
            <div class="text-muted">Pageviews</div>
            <strong>78.706 Views (60%)</strong>
            <b-progress :precision="1" :value="60" class="progress-xs mt-2" height={} variant="warning"></b-progress>
          </b-col>
          <b-col class="mb-sm-2 mb-0">
            <div class="text-muted">New Users</div>
            <strong>22.123 Users (80%)</strong>
            <b-progress :precision="1" :value="80" class="progress-xs mt-2" height={} variant="danger"></b-progress>
          </b-col>
          <b-col class="mb-sm-2 mb-0 d-md-down-none">
            <div class="text-muted">Bounce Rate</div>
            <strong>Average Rate (40.15%)</strong>
            <b-progress :precision="1" :value="40" class="progress-xs mt-2" height={}></b-progress>
          </b-col>
        </b-row>
      </div>
    </b-card>
    <b-row>
      <b-col lg="3" sm="6">
        <div class="brand-card">
          <div class="brand-card-header bg-facebook">
            <i class="fa fa-facebook"></i>
            <div class="chart-wrapper">
              <social-box-chart-example :data="[65, 59, 84, 84, 51, 55, 40]" chartId="box-chart-01"/>
            </div>
          </div>
          <div class="brand-card-body">
            <div>
              <div class="text-value">89k</div>
              <div class="text-uppercase text-muted small">friends</div>
            </div>
            <div>
              <div class="text-value">459</div>
              <div class="text-uppercase text-muted small">feeds</div>
            </div>
          </div>
        </div>
      </b-col>
      <b-col lg="3" sm="6">
        <div class="brand-card">
          <div class="brand-card-header bg-twitter">
            <i class="fa fa-twitter"></i>
            <div class="chart-wrapper">
              <social-box-chart-example :data="[1, 13, 9, 17, 34, 41, 38]" chartId="box-chart-02"/>
            </div>
          </div>
          <div class="brand-card-body">
            <div>
              <div class="text-value">973k</div>
              <div class="text-uppercase text-muted small">followers</div>
            </div>
            <div>
              <div class="text-value">1.792</div>
              <div class="text-uppercase text-muted small">tweets</div>
            </div>
          </div>
        </div>
      </b-col>
      <b-col lg="3" sm="6">
        <div class="brand-card">
          <div class="brand-card-header bg-linkedin">
            <i class="fa fa-linkedin"></i>
            <div class="chart-wrapper">
              <social-box-chart-example :data="[78, 81, 80, 45, 34, 12, 40]" chartId="box-chart-03"/>
            </div>
          </div>
          <div class="brand-card-body">
            <div>
              <div class="text-value">500+</div>
              <div class="text-uppercase text-muted small">contacts</div>
            </div>
            <div>
              <div class="text-value">292</div>
              <div class="text-uppercase text-muted small">feeds</div>
            </div>
          </div>
        </div>
      </b-col>
      <b-col lg="3" sm="6">
        <div class="brand-card">
          <div class="brand-card-header bg-google-plus">
            <i class="fa fa-google-plus"></i>
            <div class="chart-wrapper">
              <social-box-chart-example :data="[35, 23, 56, 22, 97, 23, 64]" chartId="box-chart-04"/>
            </div>
          </div>
          <div class="brand-card-body">
            <div>
              <div class="text-value">894</div>
              <div class="text-uppercase text-muted small">followers</div>
            </div>
            <div>
              <div class="text-value">92</div>
              <div class="text-uppercase text-muted small">circles</div>
            </div>
          </div>
        </div>
      </b-col>
    </b-row>
    <b-row>
      <b-col md="12">
        <b-card header="Traffic &amp; Sales">
          <b-row>
            <b-col lg="6" sm="12">
              <b-row>
                <b-col sm="6">
                  <Callout variant="info">
                    <small class="text-muted">New Clients</small>
                    <br>
                    <strong class="h4">9,123</strong>
                    <div :style="{ top: '-10px'}" class="chart-wrapper">
                      <!--<callout-chart-example :data="[35, 23, 56, 22, 97, 23, 64]" variant="#20a8d8" width="80" height="30" />-->
                      <callout-chart-example :data="[35, 23, 56, 22, 97, 23, 64]" chartId="callout-chart-01" height="30"
                                             variant="info" width="80"/>
                    </div>
                  </Callout>
                </b-col>
                <b-col sm="6">
                  <Callout variant="danger">
                    <small class="text-muted">Recurring Clients</small>
                    <br>
                    <strong class="h4">22,643</strong>
                    <div :style="{ top: '-10px'}" class="chart-wrapper">
                      <callout-chart-example :data="[65, 59, 84, 84, 51, 55, 40]" chartId="callout-chart-02" height="30"
                                             variant="danger" width="80"/>
                    </div>
                  </Callout>
                </b-col>
              </b-row>
              <hr class="mt-0">
              <div class="progress-group mb-4">
                <div class="progress-group-prepend">
                  <span class="progress-group-text">
                    Monday
                  </span>
                </div>
                <div class="progress-group-bars">
                  <b-progress :value="34" class="progress-xs" height={} variant="info"/>
                  <b-progress :value="78" class="progress-xs" height={} variant="danger"/>
                </div>
              </div>
              <div class="progress-group mb-4">
                <div class="progress-group-prepend">
                  <span class="progress-group-text">
                    Tuesday
                  </span>
                </div>
                <div class="progress-group-bars">
                  <b-progress :value="56" class="progress-xs" height={} variant="info"></b-progress>
                  <b-progress :value="94" class="progress-xs" height={} variant="danger"></b-progress>
                </div>
              </div>
              <div class="progress-group mb-4">
                <div class="progress-group-prepend">
                  <span class="progress-group-text">
                    Wednesday
                  </span>
                </div>
                <div class="progress-group-bars">
                  <b-progress :value="12" class="progress-xs" height={} variant="info"></b-progress>
                  <b-progress :value="67" class="progress-xs" height={} variant="danger"></b-progress>
                </div>
              </div>
              <div class="progress-group mb-4">
                <div class="progress-group-prepend">
                  <span class="progress-group-text">
                    Thursday
                  </span>
                </div>
                <div class="progress-group-bars">
                  <b-progress :value="43" class="progress-xs" height={} variant="info"></b-progress>
                  <b-progress :value="91" class="progress-xs" height={} variant="danger"></b-progress>
                </div>
              </div>
              <div class="progress-group mb-4">
                <div class="progress-group-prepend">
                  <span class="progress-group-text">
                    Friday
                  </span>
                </div>
                <div class="progress-group-bars">
                  <b-progress :value="22" class="progress-xs" height={} variant="info"></b-progress>
                  <b-progress :value="73" class="progress-xs" height={} variant="danger"></b-progress>
                </div>
              </div>
              <div class="progress-group mb-4">
                <div class="progress-group-prepend">
                  <span class="progress-group-text">
                    Saturday
                  </span>
                </div>
                <div class="progress-group-bars">
                  <b-progress :value="53" class="progress-xs" height={} variant="info"></b-progress>
                  <b-progress :value="82" class="progress-xs" height={} variant="danger"></b-progress>
                </div>
              </div>
              <div class="progress-group mb-4">
                <div class="progress-group-prepend">
                  <span class="progress-group-text">
                    Sunday
                  </span>
                </div>
                <div class="progress-group-bars">
                  <b-progress :value="9" class="progress-xs" height={} variant="info"></b-progress>
                  <b-progress :value="69" class="progress-xs" height={} variant="danger"></b-progress>
                </div>
              </div>
              <div class="legend text-center">
                <small>
                  <sup>
                    <b-badge pill variant="info">&nbsp;</b-badge>
                  </sup>
                  New clients
                  &nbsp;&nbsp;
                  <sup>
                    <b-badge pill variant="danger">&nbsp;</b-badge>
                  </sup>
                  Recurring clients
                </small>
              </div>
            </b-col>
            <b-col lg="6" sm="12">
              <b-row>
                <b-col sm="6">
                  <Callout variant="warning">
                    <small class="text-muted">Pageviews</small>
                    <br>
                    <strong class="h4">78,623</strong>
                    <div :style="{ top: '-10px'}" class="chart-wrapper">
                      <callout-chart-example :data="[35, 23, 56, 22, 97, 23, 64]" chartId="callout-chart-03" height="30"
                                             variant="#f8cb00" width="80"/>
                    </div>
                  </Callout>
                </b-col>
                <b-col sm="6">
                  <Callout variant="success">
                    <small class="text-muted">Organic</small>
                    <br>
                    <strong class="h4">49,123</strong>
                    <div :style="{ top: '-10px'}" class="chart-wrapper">
                      <callout-chart-example :data="[65, 59, 84, 84, 51, 55, 40]" chartId="callout-chart-04" height="30"
                                             variant="#4dbd74" width="80"/>
                    </div>
                  </Callout>
                </b-col>
              </b-row>
              <hr class="mt-0">
              <ul class="horizontal-bars type-2">
                <div class="progress-group">
                  <div class="progress-group-header">
                    <i class="icon-user progress-group-icon"></i>
                    <span class="title">Male</span>
                    <span class="ml-auto font-weight-bold">43%</span>
                  </div>
                  <div class="progress-group-bars">
                    <b-progress :value="43" class="progress-xs" height={} variant="warning"></b-progress>
                  </div>
                </div>
                <div class="progress-group mb-5">
                  <div class="progress-group-header">
                    <i class="icon-user-female progress-group-icon"></i>
                    <span class="title">Female</span>
                    <span class="ml-auto font-weight-bold">37%</span>
                  </div>
                  <div class="progress-group-bars">
                    <b-progress :value="37" class="progress-xs" height={} variant="warning"></b-progress>
                  </div>
                </div>
                <div class="progress-group">
                  <div class="progress-group-header">
                    <i class="icon-globe progress-group-icon"></i>
                    <span class="title">Organic Search</span>
                    <span class="ml-auto font-weight-bold">191,235 <span class="text-muted small">(56%)</span></span>
                  </div>
                  <div class="progress-group-bars">
                    <b-progress :value="56" class="progress-xs" height={} variant="success"></b-progress>
                  </div>
                </div>
                <div class="progress-group">
                  <div class="progress-group-header">
                    <i class="icon-social-facebook progress-group-icon"></i>
                    <span class="title">Facebook</span>
                    <span class="ml-auto font-weight-bold">51,223 <span class="text-muted small">(15%)</span></span>
                  </div>
                  <div class="progress-group-bars">
                    <b-progress :value="15" class="progress-xs" height={} variant="success"></b-progress>
                  </div>
                </div>
                <div class="progress-group">
                  <div class="progress-group-header">
                    <i class="icon-social-twitter progress-group-icon"></i>
                    <span class="title">Twitter</span>
                    <span class="ml-auto font-weight-bold">37,564 <span class="text-muted small">(11%)</span></span>
                  </div>
                  <div class="progress-group-bars">
                    <b-progress :value="11" class="progress-xs" height={} variant="success"></b-progress>
                  </div>
                </div>
                <div class="progress-group">
                  <div class="progress-group-header">
                    <i class="icon-social-linkedin progress-group-icon"></i>
                    <span class="title">LinkedIn</span>
                    <span class="ml-auto font-weight-bold">27,319 <span
                      class="text-muted small">&nbsp;(8%)</span></span>
                  </div>
                  <div class="progress-group-bars">
                    <b-progress :value="8" class="progress-xs" height={} variant="success"></b-progress>
                  </div>
                </div>
                <div class="divider text-center">
                  <b-button class="text-muted" size="sm" variant="link"><i class="icon-options"></i></b-button>
                </div>
              </ul>
            </b-col>
          </b-row>
          <br/>
          <b-table :fields="tableFields" :items="tableItems" class="mb-0 table-outline" head-variant="light" hover
                   responsive="sm">
            <div class="avatar" slot="avatar" slot-scope="item">
              <img :src="item.value.url" alt="" class="img-avatar">
              <span class="avatar-status"
                    v-bind:class="{ 'bg-success': item.value.status == 'success',  'bg-warning': item.value.status == 'warning', 'bg-danger': item.value.status == 'danger', 'bg-secondary': item.value.status == '' }"></span>
            </div>
            <div slot="user" slot-scope="item">
              <div>{{item.value.name}}</div>
              <div class="small text-muted">
                <span>
                  <template v-if="item.value.new">New</template>
                  <template v-else>Recurring</template>
                </span> | Registered: {{item.value.registered}}
              </div>
            </div>
            <i :class="flag(item.value.flag)" :id="item.value.flag" :title="item.value.flag" class="h4 mb-0"
               slot="country" slot-scope="item"></i>
            <i class="flag-icon flag-icon-pw h1" id="pw" title="pw"></i>
            <div slot="usage" slot-scope="item">
              <div class="clearfix">
                <div class="float-left">
                  <strong>{{item.value.value}}%</strong>
                </div>
                <div class="float-right">
                  <small class="text-muted">{{item.value.period}}</small>
                </div>
              </div>
              <b-progress :variant="variant(item.value.value)" class="progress-xs" height={}
                          v-model="item.value.value"></b-progress>
            </div>
            <i :class="item.value.icon" slot="payment" slot-scope="item" style="font-size:24px"></i>
            <div slot="activity" slot-scope="item">
              <div class="small text-muted">Last login</div>
              <strong>{{item.value}}</strong>
            </div>
          </b-table>
        </b-card>
      </b-col>
    </b-row>
  </div>
</template>

<script>
  import CardLine1ChartExample from './dashboard/CardLine1ChartExample'
  import CardLine2ChartExample from './dashboard/CardLine2ChartExample'
  import CardLine3ChartExample from './dashboard/CardLine3ChartExample'
  import CardBarChartExample from './dashboard/CardBarChartExample'
  import MainChartExample from './dashboard/MainChartExample'
  import SocialBoxChartExample from './dashboard/SocialBoxChartExample'
  import CalloutChartExample from './dashboard/CalloutChartExample'
  import {Callout} from '@coreui/vue'

  export default {
    name: 'dashboard',
    components: {
      Callout,
      CardLine1ChartExample,
      CardLine2ChartExample,
      CardLine3ChartExample,
      CardBarChartExample,
      MainChartExample,
      SocialBoxChartExample,
      CalloutChartExample
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
