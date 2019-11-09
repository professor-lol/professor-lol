<template>
  <div class="wrapper">
    <div class="animated fadeIn">
      <b-row>
        <b-col cols="12" md="6">
          <b-card
            footer-tag="footer"
            header-tag="header">
            <div slot="header">
              <i class="fa fa-align-justify"></i><strong> Bootstrap Dropdown</strong>
              <div class="card-header-actions">
                <a class="card-header-action" href="https://bootstrap-vue.js.org/docs/components/dropdown"
                   rel="noreferrer noopener" target="_blank">
                  <small class="text-muted">docs</small>
                </a>
              </div>
            </div>
            <div>
              <b-dropdown class="m-2" id="ddown1" text="Dropdown Button">
                <b-dropdown-item>First Action</b-dropdown-item>
                <b-dropdown-item>Second Action</b-dropdown-item>
                <b-dropdown-item>Third Action</b-dropdown-item>
                <b-dropdown-divider></b-dropdown-divider>
                <b-dropdown-item>Something else here...</b-dropdown-item>
                <b-dropdown-item disabled>Disabled action</b-dropdown-item>
              </b-dropdown>
            </div>
            <div>
              <b-dropdown class="m-2" id="ddown-buttons" text="Dropdown using buttons as menu items">
                <b-dropdown-item-button>I'm a button</b-dropdown-item-button>
                <b-dropdown-item-button>I'm also a button</b-dropdown-item-button>
                <b-dropdown-item-button disabled>I'm a button, but disabled!</b-dropdown-item-button>
                <b-dropdown-item-button>I don't look like a button, but I am!</b-dropdown-item-button>
              </b-dropdown>
            </div>
            <div>
              <b-dropdown class="m-2" id="ddown-divider" text="Dropdown with divider">
                <b-dropdown-item-button>First item</b-dropdown-item-button>
                <b-dropdown-item-button>Second item</b-dropdown-item-button>
                <b-dropdown-divider></b-dropdown-divider>
                <b-dropdown-item-button>Separated Item</b-dropdown-item-button>
              </b-dropdown>
            </div>
            <div>
              <b-dropdown class="m-2" id="ddown-header" text="Dropdown with header">
                <b-dropdown-header>Dropdown header</b-dropdown-header>
                <b-dropdown-item-button>First item</b-dropdown-item-button>
                <b-dropdown-item-button>Second Item</b-dropdown-item-button>
              </b-dropdown>
            </div>
          </b-card>
        </b-col>
        <b-col cols="12" md="6">
          <b-card
            footer-tag="footer"
            header-tag="header">
            <div slot="header">
              <i class="fa fa-align-justify"></i><strong> Dropdown </strong>
              <small>positioning</small>
            </div>
            <div>
              <b-dropdown class="m-2" id="ddown-left" text="Left align" variant="primary">
                <b-dropdown-item href="#">Action</b-dropdown-item>
                <b-dropdown-item href="#">Another action</b-dropdown-item>
                <b-dropdown-item href="#">Something else here</b-dropdown-item>
              </b-dropdown>
              <b-dropdown class="m-2" id="ddown-right" right text="Right align" variant="primary">
                <b-dropdown-item href="#">Action</b-dropdown-item>
                <b-dropdown-item href="#">Another action</b-dropdown-item>
                <b-dropdown-item href="#">Something else here</b-dropdown-item>
              </b-dropdown>
            </div>
            <div>
              <b-dropdown class="m-2" dropup id="ddown-dropup" text="Drop-Up" variant="info">
                <b-dropdown-item href="#">Action</b-dropdown-item>
                <b-dropdown-item href="#">Another action</b-dropdown-item>
                <b-dropdown-item href="#">Something else here</b-dropdown-item>
              </b-dropdown>
            </div>
            <div>
              <b-dropdown class="m-2" id="ddown-offset" offset="25" text="Offset Dropdown">
                <b-dropdown-item href="#">Action</b-dropdown-item>
                <b-dropdown-item href="#">Another action</b-dropdown-item>
                <b-dropdown-item href="#">Something else here</b-dropdown-item>
              </b-dropdown>
            </div>
            <div>
              <b-dropdown class="m-2" id="ddown-split" split text="Split Dropdown">
                <b-dropdown-item href="#">Action</b-dropdown-item>
                <b-dropdown-item href="#">Another action</b-dropdown-item>
                <b-dropdown-item href="#">Something else here...</b-dropdown-item>
              </b-dropdown>
            </div>
          </b-card>
        </b-col>
      </b-row>
      <b-row>
        <b-col cols="12" md="6">
          <b-card
            footer-tag="footer"
            header-tag="header">
            <div slot="header">
              <i class="fa fa-align-justify"></i><strong> Dropdown </strong>
              <small>hidden caret</small>
            </div>
            <div>
              <b-dropdown no-caret size="lg" variant="link">
                <template slot="button-content">
                  &#x1f50d;<span class="sr-only">Search</span>
                </template>

                <b-dropdown-item href="#">Action</b-dropdown-item>
                <b-dropdown-item href="#">Another action</b-dropdown-item>
                <b-dropdown-item href="#">Something else here...</b-dropdown-item>
              </b-dropdown>
            </div>
          </b-card>
        </b-col>
        <b-col cols="12" md="6">
          <b-card
            footer-tag="footer"
            header-tag="header">
            <div slot="header">
              <i class="fa fa-align-justify"></i><strong> Dropdown </strong>
              <small>sizing</small>
            </div>
            <div>
              <b-dropdown class="m-2" id="ddown-lg" size="lg" text="Large">
                <b-dropdown-item-button>Action</b-dropdown-item-button>
                <b-dropdown-item-button>Another action</b-dropdown-item-button>
                <b-dropdown-item-button>Something else here</b-dropdown-item-button>
              </b-dropdown>
              <b-dropdown class="m-2" id="ddown-lg-split" size="lg" split text="Large Split">
                <b-dropdown-item-button>Action</b-dropdown-item-button>
                <b-dropdown-item-button>Another action</b-dropdown-item-button>
                <b-dropdown-item-button>Something else here...</b-dropdown-item-button>
              </b-dropdown>
              <br>
              <b-dropdown class="m-2" id="ddown-sm" size="sm" text="Small">
                <b-dropdown-item-button>Action</b-dropdown-item-button>
                <b-dropdown-item-button>Another action</b-dropdown-item-button>
                <b-dropdown-item-button>Something else here...</b-dropdown-item-button>
              </b-dropdown>
              <b-dropdown class="m-2" id="ddown-sm-split" size="sm" split text="Small Split">
                <b-dropdown-item-button>Action</b-dropdown-item-button>
                <b-dropdown-item-button>Another action</b-dropdown-item-button>
                <b-dropdown-item-button>Something else here...</b-dropdown-item-button>
              </b-dropdown>
            </div>
          </b-card>
        </b-col>
      </b-row>
      <b-row>
        <b-col cols="12" md="6">
          <b-card
            footer-tag="footer"
            header-tag="header">
            <div slot="header">
              <i class="fa fa-align-justify"></i><strong> Dropdown </strong>
              <small>headers and accessibility</small>
            </div>
            <div>
              <b-dropdown class="m-2" id="ddown-aria" text="Dropdown ARIA" variant="primary">
                <div aria-lableledby="header1" role="group">
                  <b-dropdown-header id="header1">Groups</b-dropdown-header>
                  <b-dropdown-item-button aria-describedby="header1">Add</b-dropdown-item-button>
                  <b-dropdown-item-button aria-describedby="header1">Delete</b-dropdown-item-button>
                </div>
                <div aria-lableledby="header2" role="group">
                  <b-dropdown-header id="header2">Users</b-dropdown-header>
                  <b-dropdown-item-button aria-describedby="header2">Add</b-dropdown-item-button>
                  <b-dropdown-item-button aria-describedby="header2">Delete</b-dropdown-item-button>
                </div>
                <b-dropdown-divider></b-dropdown-divider>
                <b-dropdown-item-button>Something <strong>not</strong> associated with user</b-dropdown-item-button>
              </b-dropdown>
            </div>
          </b-card>
        </b-col>
        <b-col cols="12" md="6">
          <b-card
            footer-tag="footer"
            header-tag="header">
            <div slot="header">
              <i class="fa fa-align-justify"></i><strong> Dropdown </strong>
              <small><code>variant</code></small>
            </div>
            <b-dropdown class="m-1" id="ddown_primary" size="sm" text="Primary" variant="primary">
              <b-dropdown-item>First Action</b-dropdown-item>
              <b-dropdown-item>Second Action</b-dropdown-item>
              <b-dropdown-item>Third Action</b-dropdown-item>
            </b-dropdown>
            <b-dropdown class="m-1" id="ddown_secondary" size="sm" text="Secondary" variant="secondary">
              <b-dropdown-item>First Action</b-dropdown-item>
              <b-dropdown-item>Second Action</b-dropdown-item>
              <b-dropdown-item>Third Action</b-dropdown-item>
            </b-dropdown>
            <b-dropdown class="m-1" id="ddown_success" size="sm" text="Success" variant="success">
              <b-dropdown-item>First Action</b-dropdown-item>
              <b-dropdown-item>Second Action</b-dropdown-item>
              <b-dropdown-item>Third Action</b-dropdown-item>
            </b-dropdown>
            <b-dropdown class="m-1" id="ddown_warning" size="sm" text="Warning" variant="warning">
              <b-dropdown-item>First Action</b-dropdown-item>
              <b-dropdown-item>Second Action</b-dropdown-item>
              <b-dropdown-item>Third Action</b-dropdown-item>
            </b-dropdown>
            <b-dropdown class="m-1" id="ddown_danger" size="sm" text="Danger" variant="danger">
              <b-dropdown-item>First Action</b-dropdown-item>
              <b-dropdown-item>Second Action</b-dropdown-item>
              <b-dropdown-item>Third Action</b-dropdown-item>
            </b-dropdown>
            <b-dropdown class="m-1" id="ddown_info" size="sm" text="Info" variant="info">
              <b-dropdown-item>First Action</b-dropdown-item>
              <b-dropdown-item>Second Action</b-dropdown-item>
              <b-dropdown-item>Third Action</b-dropdown-item>
            </b-dropdown>
            <b-dropdown class="m-1" id="ddown_light" size="sm" text="Light" variant="light">
              <b-dropdown-item>First Action</b-dropdown-item>
              <b-dropdown-item>Second Action</b-dropdown-item>
              <b-dropdown-item>Third Action</b-dropdown-item>
            </b-dropdown>
            <b-dropdown class="m-1" id="ddown_dark" size="sm" text="Dark" variant="dark">
              <b-dropdown-item>First Action</b-dropdown-item>
              <b-dropdown-item>Second Action</b-dropdown-item>
              <b-dropdown-item>Third Action</b-dropdown-item>
            </b-dropdown>
            <b-dropdown class="m-1" id="ddown_link" size="sm" text="Link" variant="link">
              <b-dropdown-item>First Action</b-dropdown-item>
              <b-dropdown-item>Second Action</b-dropdown-item>
              <b-dropdown-item>Third Action</b-dropdown-item>
            </b-dropdown>
          </b-card>
        </b-col>
      </b-row>
    </div>
  </div>
</template>

<script>
  export default {
    name: 'dropdowns'
  }
</script>
