<template>
  <b-tabs>
    <b-tab>
      <template slot="title">
        <i class='icon-list'></i>
      </template>
      <b-list-group class="list-group-accent">
        <b-list-group-item
          class="list-group-item-accent-secondary bg-light text-center font-weight-bold text-muted text-uppercase small">
          Today
        </b-list-group-item>
        <b-list-group-item class="list-group-item-accent-warning list-group-item-divider" href="#">
          <div class="avatar float-right">
            <img alt="admin@bootstrapmaster.com" class="img-avatar" src="img/avatars/7.jpg">
          </div>
          <div>Meeting with
            <strong>Lucas</strong>
          </div>
          <small class="text-muted mr-3">
            <i class="icon-calendar"></i>&nbsp;&nbsp;1 - 3pm
          </small>
          <small class="text-muted">
            <i class="icon-location-pin"></i>&nbsp;&nbsp;Palo Alto, CA
          </small>
        </b-list-group-item>
        <b-list-group-item class="list-group-item-accent-info" href="#">
          <div class="avatar float-right">
            <img alt="admin@bootstrapmaster.com" class="img-avatar" src="img/avatars/4.jpg">
          </div>
          <div>Skype with <strong>Megan</strong>
          </div>
          <small class="text-muted mr-3"><i class="icon-calendar"></i>&nbsp;&nbsp;4 - 5pm</small>
          <small class="text-muted"><i class="icon-social-skype"></i>&nbsp;&nbsp;On-line</small>
        </b-list-group-item>
        <hr class="transparent mx-3 my-0">
        <b-list-group-item
          class="list-group-item-accent-secondary bg-light text-center font-weight-bold text-muted text-uppercase small">
          Tomorrow
        </b-list-group-item>
        <b-list-group-item class="list-group-item-accent-danger list-group-item-divider" href="#">
          <div>New UI Project - <strong>deadline</strong>
          </div>
          <small class="text-muted mr-3"><i class="icon-calendar"></i>&nbsp;&nbsp;10 - 11pm</small>
          <small class="text-muted"><i class="icon-home"></i>&nbsp;&nbsp;creativeLabs HQ</small>
          <div class="avatars-stack mt-2">
            <div class="avatar avatar-xs">
              <img alt="admin@bootstrapmaster.com" class="img-avatar" src="img/avatars/2.jpg">
            </div>
            <div class="avatar avatar-xs">
              <img alt="admin@bootstrapmaster.com" class="img-avatar" src="img/avatars/3.jpg">
            </div>
            <div class="avatar avatar-xs">
              <img alt="admin@bootstrapmaster.com" class="img-avatar" src="img/avatars/4.jpg">
            </div>
            <div class="avatar avatar-xs">
              <img alt="admin@bootstrapmaster.com" class="img-avatar" src="img/avatars/5.jpg">
            </div>
            <div class="avatar avatar-xs">
              <img alt="admin@bootstrapmaster.com" class="img-avatar" src="img/avatars/6.jpg">
            </div>
          </div>
        </b-list-group-item>
        <b-list-group-item class="list-group-item-accent-success list-group-item-divider" href="#">
          <div><strong>#10 Startups.Garden</strong> Meetup</div>
          <small class="text-muted mr-3"><i class="icon-calendar"></i>&nbsp; 1 - 3pm</small>
          <small class="text-muted"><i class="icon-location-pin"></i>&nbsp; Palo Alto, CA</small>
        </b-list-group-item>
        <b-list-group-item class="list-group-item-accent-primary list-group-item-divider" href="#">
          <div><strong>Team meeting</strong></div>
          <small class="text-muted mr-3"><i class="icon-calendar"></i>&nbsp; 4 - 6pm</small>
          <small class="text-muted"><i class="icon-home"></i>&nbsp; creativeLabs HQ</small>
          <div class="avatars-stack mt-2">
            <div class="avatar avatar-xs">
              <img alt="admin@bootstrapmaster.com" class="img-avatar" src="img/avatars/2.jpg">
            </div>
            <div class="avatar avatar-xs">
              <img alt="admin@bootstrapmaster.com" class="img-avatar" src="img/avatars/3.jpg">
            </div>
            <div class="avatar avatar-xs">
              <img alt="admin@bootstrapmaster.com" class="img-avatar" src="img/avatars/4.jpg">
            </div>
            <div class="avatar avatar-xs">
              <img alt="admin@bootstrapmaster.com" class="img-avatar" src="img/avatars/5.jpg">
            </div>
            <div class="avatar avatar-xs">
              <img alt="admin@bootstrapmaster.com" class="img-avatar" src="img/avatars/6.jpg">
            </div>
            <div class="avatar avatar-xs">
              <img alt="admin@bootstrapmaster.com" class="img-avatar" src="img/avatars/7.jpg">
            </div>
            <div class="avatar avatar-xs">
              <img alt="admin@bootstrapmaster.com" class="img-avatar" src="img/avatars/8.jpg">
            </div>
          </div>
        </b-list-group-item>
      </b-list-group>
    </b-tab>
    <b-tab>
      <template slot="title">
        <i class='icon-speech'></i>
      </template>
      <div class="p-3">
        <div class="message">
          <div class="py-3 pb-5 mr-3 float-left">
            <div class="avatar">
              <img alt="admin@bootstrapmaster.com" class="img-avatar" src="img/avatars/7.jpg">
              <b-badge class="avatar-status" variant="success"></b-badge>
            </div>
          </div>
          <div>
            <small class="text-muted">Lukasz Holeczek</small>
            <small class="text-muted float-right mt-1">1:52 PM</small>
          </div>
          <div class="text-truncate font-weight-bold">Lorem ipsum dolor sit amet</div>
          <small class="text-muted">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
            incididunt...
          </small>
        </div>
        <hr>
        <div class="message">
          <div class="py-3 pb-5 mr-3 float-left">
            <div class="avatar">
              <img alt="admin@bootstrapmaster.com" class="img-avatar" src="img/avatars/7.jpg">
              <b-badge class="avatar-status" variant="danger"></b-badge>
            </div>
          </div>
          <div>
            <small class="text-muted">Lukasz Holeczek</small>
            <small class="text-muted float-right mt-1">1:52 PM</small>
          </div>
          <div class="text-truncate font-weight-bold">Lorem ipsum dolor sit amet</div>
          <small class="text-muted">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
            incididunt...
          </small>
        </div>
        <hr>
        <div class="message">
          <div class="py-3 pb-5 mr-3 float-left">
            <div class="avatar">
              <img alt="admin@bootstrapmaster.com" class="img-avatar" src="img/avatars/7.jpg">
              <b-badge class="avatar-status" variant="info"></b-badge>
            </div>
          </div>
          <div>
            <small class="text-muted">Lukasz Holeczek</small>
            <small class="text-muted float-right mt-1">1:52 PM</small>
          </div>
          <div class="text-truncate font-weight-bold">Lorem ipsum dolor sit amet</div>
          <small class="text-muted">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
            incididunt...
          </small>
        </div>
        <hr>
        <div class="message">
          <div class="py-3 pb-5 mr-3 float-left">
            <div class="avatar">
              <img alt="admin@bootstrapmaster.com" class="img-avatar" src="img/avatars/7.jpg">
              <b-badge class="avatar-status" variant="warning"></b-badge>
            </div>
          </div>
          <div>
            <small class="text-muted">Lukasz Holeczek</small>
            <small class="text-muted float-right mt-1">1:52 PM</small>
          </div>
          <div class="text-truncate font-weight-bold">Lorem ipsum dolor sit amet</div>
          <small class="text-muted">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
            incididunt...
          </small>
        </div>
        <hr>
        <div class="message">
          <div class="py-3 pb-5 mr-3 float-left">
            <div class="avatar">
              <img alt="admin@bootstrapmaster.com" class="img-avatar" src="img/avatars/7.jpg">
              <b-badge class="avatar-status" variant="dark"></b-badge>
            </div>
          </div>
          <div>
            <small class="text-muted">Lukasz Holeczek</small>
            <small class="text-muted float-right mt-1">1:52 PM</small>
          </div>
          <div class="text-truncate font-weight-bold">Lorem ipsum dolor sit amet</div>
          <small class="text-muted">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
            incididunt...
          </small>
        </div>
      </div>
    </b-tab>
    <b-tab>
      <template slot="title">
        <i class='icon-settings'></i>
      </template>
      <div class="p-3">
        <h6>Settings</h6>
        <div class="aside-options">
          <div class="clearfix mt-4">
            <small><b>Option 1</b></small>
            <c-switch checked class="float-right" color="success" label size="sm" variant="pill"/>
          </div>
          <div>
            <small class="text-muted">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
              incididunt ut labore et dolore magna aliqua.
            </small>
          </div>
        </div>
        <div class="aside-options">
          <div class="clearfix mt-3">
            <small><b>Option 2</b></small>
            <c-switch class="float-right" color="success" label size="sm" variant="pill"/>
          </div>
          <div>
            <small class="text-muted">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
              incididunt ut labore et dolore magna aliqua.
            </small>
          </div>
        </div>
        <div class="aside-options">
          <div class="clearfix mt-3">
            <small><b>Option 3</b></small>
            <c-switch class="float-right" color="success" defaultChecked disabled label size="sm" variant="pill"/>
          </div>
          <div>
            <small class="text-muted">Disabled option.</small>
          </div>
        </div>
        <div class="aside-options">
          <div class="clearfix mt-3">
            <small><b>Option 4</b></small>
            <c-switch checked class="float-right" color="success" label size="sm" variant="pill"/>
          </div>
        </div>
        <hr>
        <h6>System Utilization</h6>
        <div class="text-uppercase mb-1 mt-4">
          <small><b>CPU Usage</b></small>
        </div>
        <b-progress :value="25" class="progress-xs" height={} variant="info"></b-progress>
        <small class="text-muted">348 Processes. 1/4 Cores.</small>
        <div class="text-uppercase mb-1 mt-2">
          <small><b>Memory Usage</b></small>
        </div>
        <b-progress :value="70" class="progress-xs" height={} variant="warning"></b-progress>
        <small class="text-muted">11444GB/16384MB</small>
        <div class="text-uppercase mb-1 mt-2">
          <small><b>SSD 1 Usage</b></small>
        </div>
        <b-progress :value="95" class="progress-xs" height={} variant="danger"></b-progress>
        <small class="text-muted">243GB/256GB</small>
        <div class="text-uppercase mb-1 mt-2">
          <small><b>SSD 2 Usage</b></small>
        </div>
        <b-progress :value="10" class="progress-xs" height={} variant="success"></b-progress>
        <small class="text-muted">25GB/256GB</small>
      </div>
    </b-tab>
  </b-tabs>
</template>

<script>
  import {Switch as cSwitch} from '@coreui/vue'

  export default {
    name: 'DefaultAside',
    components: {
      cSwitch
    }
  }
</script>
