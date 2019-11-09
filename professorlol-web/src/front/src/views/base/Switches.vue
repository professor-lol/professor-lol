<template>
  <div class="animated fadeIn">
    <b-row>
      <b-col md="6" xs="12">
        <b-card>
          <div slot="header">
            Switch default
            <b-badge variant="primary">{{checker}}</b-badge>
          </div>
          <c-switch checked class="mx-1" color="primary" name="switch1" uncheckedValue="no" v-model="checker"
                    value="yes"/>
          <c-switch checked class="mx-1" color="secondary"/>
          <c-switch checked class="mx-1" color="success"/>
          <c-switch checked class="mx-1" color="warning"/>
          <c-switch checked class="mx-1" color="info"/>
          <c-switch checked class="mx-1" color="danger"/>
          <c-switch checked class="mx-1" color="light"/>
          <c-switch checked class="mx-1" color="dark"/>
          <c-switch class="mx-1" color="primary" disabled/>
        </b-card>
      </b-col>
      <b-col md="6" xs="12">
        <b-card>
          <div slot="header">
            Switch pills
          </div>
          <c-switch checked class="mx-1" color="primary" variant="pill"/>
          <c-switch checked class="mx-1" color="secondary" variant="pill"/>
          <c-switch checked class="mx-1" color="success" variant="pill"/>
          <c-switch checked class="mx-1" color="warning" variant="pill"/>
          <c-switch checked class="mx-1" color="info" variant="pill"/>
          <c-switch checked class="mx-1" color="danger" variant="pill"/>
          <c-switch checked class="mx-1" color="light" variant="pill"/>
          <c-switch checked class="mx-1" color="dark" variant="pill"/>
          <c-switch class="mx-1" color="primary" disabled variant="pill"/>
        </b-card>
      </b-col>
      <b-col md="6" xs="12">
        <b-card>
          <div slot="header">
            3d Switch
          </div>
          <c-switch checked class="mx-1" color="primary" variant="3d"/>
          <c-switch checked class="mx-1" color="secondary" variant="3d"/>
          <c-switch checked class="mx-1" color="success" variant="3d"/>
          <c-switch checked class="mx-1" color="warning" variant="3d"/>
          <c-switch checked class="mx-1" color="info" variant="3d"/>
          <c-switch checked class="mx-1" color="danger" variant="3d"/>
          <c-switch checked class="mx-1" color="light" variant="3d"/>
          <c-switch checked class="mx-1" color="dark" variant="3d"/>
          <c-switch class="mx-1" color="primary" disabled variant="3d"/>
        </b-card>
      </b-col>
      <b-col md="6" xs="12">
        <b-card>
          <div slot="header">
            3d Switch
            <small><code>disabled</code></small>
          </div>
          <c-switch checked class="mx-1" color="primary" disabled variant="3d"/>
          <c-switch checked class="mx-1" color="secondary" disabled variant="3d"/>
          <c-switch checked class="mx-1" color="success" disabled variant="3d"/>
          <c-switch checked class="mx-1" color="warning" disabled variant="3d"/>
          <c-switch checked class="mx-1" color="info" disabled variant="3d"/>
          <c-switch checked class="mx-1" color="danger" disabled variant="3d"/>
          <c-switch checked class="mx-1" color="light" disabled variant="3d"/>
          <c-switch checked class="mx-1" color="dark" disabled variant="3d"/>
          <c-switch class="mx-1" color="primary" disabled variant="3d"/>
        </b-card>
      </b-col>
      <b-col md="6" xs="12">
        <b-card>
          <div slot="header">
            3d Switch
            <small><code>outline="alt"</code></small>
          </div>
          <c-switch checked class="mx-1" color="primary" outline="alt" variant="3d"/>
          <c-switch checked class="mx-1" color="secondary" outline="alt" variant="3d"/>
          <c-switch checked class="mx-1" color="success" outline="alt" variant="3d"/>
          <c-switch checked class="mx-1" color="warning" outline="alt" variant="3d"/>
          <c-switch checked class="mx-1" color="info" outline="alt" variant="3d"/>
          <c-switch checked class="mx-1" color="danger" outline="alt" variant="3d"/>
          <c-switch checked class="mx-1" color="light" outline="alt" variant="3d"/>
          <c-switch checked class="mx-1" color="dark" outline="alt" variant="3d"/>
          <c-switch class="mx-1" color="primary" disabled outline="alt" variant="3d"/>
        </b-card>
      </b-col>
      <b-col md="6" xs="12">
        <b-card>
          <div slot="header">
            3d Switch
            <small><code>label</code></small>
          </div>
          <c-switch class="mx-1" color="primary" defaultChecked label v-bind="labelIcon" variant="3d"/>
          <c-switch class="mx-1" color="secondary" defaultChecked label v-bind="labelIcon" variant="3d"/>
          <c-switch class="mx-1" color="success" defaultChecked label v-bind="labelIcon" variant="3d"/>
          <c-switch class="mx-1" color="warning" defaultChecked label v-bind="labelIcon" variant="3d"/>
          <c-switch class="mx-1" color="info" defaultChecked label v-bind="labelIcon" variant="3d"/>
          <c-switch class="mx-1" color="danger" defaultChecked label v-bind="labelIcon" variant="3d"/>
          <c-switch class="mx-1" color="light" defaultChecked label v-bind="labelIcon" variant="3d"/>
          <c-switch class="mx-1" color="dark" defaultChecked label v-bind="labelIcon" variant="3d"/>
          <c-switch class="mx-1" color="primary" disabled label v-bind="labelIcon" variant="3d"/>
        </b-card>
      </b-col>
      <b-col md="6" xs="12">
        <b-card>
          <div slot="header">
            3d Switch
            <small><code>outline="alt" label</code></small>
          </div>
          <c-switch class="mx-1" color="primary" defaultChecked label outline="alt" v-bind="labelIcon" variant="3d"/>
          <c-switch class="mx-1" color="secondary" defaultChecked label outline="alt" v-bind="labelIcon" variant="3d"/>
          <c-switch class="mx-1" color="success" defaultChecked label outline="alt" v-bind="labelIcon" variant="3d"/>
          <c-switch class="mx-1" color="warning" defaultChecked label outline="alt" v-bind="labelIcon" variant="3d"/>
          <c-switch class="mx-1" color="info" defaultChecked label outline="alt" v-bind="labelIcon" variant="3d"/>
          <c-switch class="mx-1" color="danger" defaultChecked label outline="alt" v-bind="labelIcon" variant="3d"/>
          <c-switch class="mx-1" color="light" defaultChecked label outline="alt" v-bind="labelIcon" variant="3d"/>
          <c-switch class="mx-1" color="dark" defaultChecked label outline="alt" v-bind="labelIcon" variant="3d"/>
          <c-switch class="mx-1" color="primary" disabled label outline="alt" v-bind="labelIcon" variant="3d"/>
        </b-card>
      </b-col>
      <b-col md="6" xs="12">
        <b-card>
          <div slot="header">
            3d Switch
            <small><code>outline="alt" label</code></small>
          </div>
          <c-switch class="mx-1" color="primary" defaultChecked label outline="alt" variant="3d"/>
          <c-switch class="mx-1" color="secondary" defaultChecked label outline="alt" variant="3d"/>
          <c-switch class="mx-1" color="success" defaultChecked label outline="alt" variant="3d"/>
          <c-switch class="mx-1" color="warning" defaultChecked label outline="alt" variant="3d"/>
          <c-switch class="mx-1" color="info" defaultChecked label outline="alt" variant="3d"/>
          <c-switch class="mx-1" color="danger" defaultChecked label outline="alt" variant="3d"/>
          <c-switch class="mx-1" color="light" defaultChecked label outline="alt" variant="3d"/>
          <c-switch class="mx-1" color="dark" defaultChecked label outline="alt" variant="3d"/>
          <c-switch class="mx-1" color="primary" disabled label outline="alt" variant="3d"/>
        </b-card>
      </b-col>
      <b-col md="6" xs="12">
        <b-card>
          <div slot="header">
            Switch
            <small><code>outline</code></small>
          </div>
          <c-switch checked class="mx-1" color="primary" outline/>
          <c-switch checked class="mx-1" color="secondary" outline/>
          <c-switch checked class="mx-1" color="success" outline/>
          <c-switch checked class="mx-1" color="warning" outline/>
          <c-switch checked class="mx-1" color="info" outline/>
          <c-switch checked class="mx-1" color="danger" outline/>
          <c-switch checked class="mx-1" color="light" outline/>
          <c-switch checked class="mx-1" color="dark" outline/>
          <c-switch class="mx-1" color="primary" disabled outline/>
        </b-card>
      </b-col>
      <b-col md="6" xs="12">
        <b-card>
          <div slot="header">
            Switch
            <small><code>outline variant="pill"</code></small>
          </div>
          <c-switch checked class="mx-1" color="primary" outline variant="pill"/>
          <c-switch checked class="mx-1" color="secondary" outline variant="pill"/>
          <c-switch checked class="mx-1" color="success" outline variant="pill"/>
          <c-switch checked class="mx-1" color="warning" outline variant="pill"/>
          <c-switch checked class="mx-1" color="info" outline variant="pill"/>
          <c-switch checked class="mx-1" color="danger" outline variant="pill"/>
          <c-switch checked class="mx-1" color="light" outline variant="pill"/>
          <c-switch checked class="mx-1" color="dark" outline variant="pill"/>
          <c-switch class="mx-1" color="primary" disabled outline variant="pill"/>
        </b-card>
      </b-col>
      <b-col md="6" xs="12">
        <b-card>
          <div slot="header">
            Switch
            <small><code>outline="alt"</code></small>
          </div>
          <c-switch checked class="mx-1" color="primary" outline="alt"/>
          <c-switch checked class="mx-1" color="secondary" outline="alt"/>
          <c-switch checked class="mx-1" color="success" outline="alt"/>
          <c-switch checked class="mx-1" color="warning" outline="alt"/>
          <c-switch checked class="mx-1" color="info" outline="alt"/>
          <c-switch checked class="mx-1" color="danger" outline="alt"/>
          <c-switch checked class="mx-1" color="light" outline="alt"/>
          <c-switch checked class="mx-1" color="dark" outline="alt"/>
          <c-switch class="mx-1" color="primary" disabled outline="alt"/>
        </b-card>
      </b-col>
      <b-col md="6" xs="12">
        <b-card>
          <div slot="header">
            Switch
            <small><code>outline="alt" variant="pill"</code></small>
          </div>
          <c-switch checked class="mx-1" color="primary" outline="alt" variant="pill"/>
          <c-switch checked class="mx-1" color="secondary" outline="alt" variant="pill"/>
          <c-switch checked class="mx-1" color="success" outline="alt" variant="pill"/>
          <c-switch checked class="mx-1" color="warning" outline="alt" variant="pill"/>
          <c-switch checked class="mx-1" color="info" outline="alt" variant="pill"/>
          <c-switch checked class="mx-1" color="danger" outline="alt" variant="pill"/>
          <c-switch checked class="mx-1" color="light" outline="alt" variant="pill"/>
          <c-switch checked class="mx-1" color="dark" outline="alt" variant="pill"/>
          <c-switch class="mx-1" color="primary" disabled outline="alt" variant="pill"/>
        </b-card>
      </b-col>
      <b-col md="6" xs="12">
        <b-card>
          <div slot="header">
            Switch
            <small><code>label</code></small>
          </div>
          <c-switch checked class="mx-1" color="primary" label/>
          <c-switch checked class="mx-1" color="secondary" label/>
          <c-switch checked class="mx-1" color="success" label/>
          <c-switch checked class="mx-1" color="warning" label/>
          <c-switch checked class="mx-1" color="info" label/>
          <c-switch checked class="mx-1" color="danger" label/>
          <c-switch checked class="mx-1" color="light" label/>
          <c-switch checked class="mx-1" color="dark" label/>
          <c-switch class="mx-1" color="primary" disabled label/>
        </b-card>
      </b-col>
      <b-col md="6" xs="12">
        <b-card>
          <div slot="header">
            Switch
            <small><code>label variant="pill"</code></small>
          </div>
          <c-switch checked class="mx-1" color="primary" label variant="pill"/>
          <c-switch checked class="mx-1" color="secondary" label variant="pill"/>
          <c-switch checked class="mx-1" color="success" label variant="pill"/>
          <c-switch checked class="mx-1" color="warning" label variant="pill"/>
          <c-switch checked class="mx-1" color="info" label variant="pill"/>
          <c-switch checked class="mx-1" color="danger" label variant="pill"/>
          <c-switch checked class="mx-1" color="light" label variant="pill"/>
          <c-switch checked class="mx-1" color="dark" label variant="pill"/>
          <c-switch class="mx-1" color="primary" disabled label variant="pill"/>
        </b-card>
      </b-col>
      <b-col md="6" xs="12">
        <b-card>
          <div slot="header">
            Switch
            <small><code>label outline</code></small>
          </div>
          <c-switch checked class="mx-1" color="primary" label outline/>
          <c-switch checked class="mx-1" color="secondary" label outline/>
          <c-switch checked class="mx-1" color="success" label outline/>
          <c-switch checked class="mx-1" color="warning" label outline/>
          <c-switch checked class="mx-1" color="info" label outline/>
          <c-switch checked class="mx-1" color="danger" label outline/>
          <c-switch checked class="mx-1" color="light" label outline/>
          <c-switch checked class="mx-1" color="dark" label outline/>
          <c-switch class="mx-1" color="primary" disabled label outline/>
        </b-card>
      </b-col>
      <b-col md="6" xs="12">
        <b-card>
          <div slot="header">
            Switch
            <small><code>label outline</code></small>
          </div>
          <c-switch checked class="mx-1" color="primary" label outline variant="pill"/>
          <c-switch checked class="mx-1" color="secondary" label outline variant="pill"/>
          <c-switch checked class="mx-1" color="success" label outline variant="pill"/>
          <c-switch checked class="mx-1" color="warning" label outline variant="pill"/>
          <c-switch checked class="mx-1" color="info" label outline variant="pill"/>
          <c-switch checked class="mx-1" color="danger" label outline variant="pill"/>
          <c-switch checked class="mx-1" color="light" label outline variant="pill"/>
          <c-switch checked class="mx-1" color="dark" label outline variant="pill"/>
          <c-switch class="mx-1" color="primary" disabled label outline variant="pill"/>
        </b-card>
      </b-col>
      <b-col md="6" xs="12">
        <b-card>
          <div slot="header">
            Switch
            <small><code>label outline</code></small>
          </div>
          <c-switch checked class="mx-1" color="primary" label outline="alt"/>
          <c-switch checked class="mx-1" color="secondary" label outline="alt"/>
          <c-switch checked class="mx-1" color="success" label outline="alt"/>
          <c-switch checked class="mx-1" color="warning" label outline="alt"/>
          <c-switch checked class="mx-1" color="info" label outline="alt"/>
          <c-switch checked class="mx-1" color="danger" label outline="alt"/>
          <c-switch checked class="mx-1" color="light" label outline="alt"/>
          <c-switch checked class="mx-1" color="dark" label outline="alt"/>
          <c-switch class="mx-1" color="primary" disabled label outline="alt"/>
        </b-card>
      </b-col>
      <b-col md="6" xs="12">
        <b-card>
          <div slot="header">
            Switch
            <small><code>label outline</code></small>
          </div>
          <c-switch checked class="mx-1" color="primary" label outline="alt" variant="pill"/>
          <c-switch checked class="mx-1" color="secondary" label outline="alt" variant="pill"/>
          <c-switch checked class="mx-1" color="success" label outline="alt" variant="pill"/>
          <c-switch checked class="mx-1" color="warning" label outline="alt" variant="pill"/>
          <c-switch checked class="mx-1" color="info" label outline="alt" variant="pill"/>
          <c-switch checked class="mx-1" color="danger" label outline="alt" variant="pill"/>
          <c-switch checked class="mx-1" color="light" label outline="alt" variant="pill"/>
          <c-switch checked class="mx-1" color="dark" label outline="alt" variant="pill"/>
          <c-switch class="mx-1" color="primary" disabled label outline="alt" variant="pill"/>
        </b-card>
      </b-col>

      <b-col md="6" xs="12">
        <b-card>
          <div slot="header">
            Switch
            <small><code>label</code></small>
          </div>
          <c-switch checked class="mx-1" color="primary" dataOff="no" dataOn="yes" label/>
          <c-switch checked class="mx-1" color="secondary" label v-bind="labelIcon"/>
          <c-switch checked class="mx-1" color="success" label v-bind="labelIcon"/>
          <c-switch checked class="mx-1" color="warning" label v-bind="labelIcon"/>
          <c-switch checked class="mx-1" color="info" label v-bind="labelIcon"/>
          <c-switch checked class="mx-1" color="danger" label v-bind="labelIcon"/>
          <c-switch checked class="mx-1" color="light" label v-bind="labelIcon"/>
          <c-switch checked class="mx-1" color="dark" label v-bind="labelIcon"/>
          <c-switch class="mx-1" color="primary" disabled label v-bind="labelIcon"/>
        </b-card>
      </b-col>
      <b-col md="6" xs="12">
        <b-card>
          <div slot="header">
            Switch
            <small><code>label variant="pill"</code></small>
          </div>
          <c-switch checked class="mx-1" color="primary" label v-bind="labelIcon" variant="pill"/>
          <c-switch checked class="mx-1" color="secondary" label v-bind="labelIcon" variant="pill"/>
          <c-switch checked class="mx-1" color="success" label v-bind="labelIcon" variant="pill"/>
          <c-switch checked class="mx-1" color="warning" label v-bind="labelIcon" variant="pill"/>
          <c-switch checked class="mx-1" color="info" label v-bind="labelIcon" variant="pill"/>
          <c-switch checked class="mx-1" color="danger" label v-bind="labelIcon" variant="pill"/>
          <c-switch checked class="mx-1" color="light" label v-bind="labelIcon" variant="pill"/>
          <c-switch checked class="mx-1" color="dark" label v-bind="labelIcon" variant="pill"/>
          <c-switch class="mx-1" color="primary" disabled label v-bind="labelIcon" variant="pill"/>
        </b-card>
      </b-col>
      <b-col md="6" xs="12">
        <b-card>
          <div slot="header">
            Switch
            <small><code>label outline</code></small>
          </div>
          <c-switch checked class="mx-1" color="primary" label outline v-bind="labelIcon"/>
          <c-switch checked class="mx-1" color="secondary" label outline v-bind="labelIcon"/>
          <c-switch checked class="mx-1" color="success" label outline v-bind="labelIcon"/>
          <c-switch checked class="mx-1" color="warning" label outline v-bind="labelIcon"/>
          <c-switch checked class="mx-1" color="info" label outline v-bind="labelIcon"/>
          <c-switch checked class="mx-1" color="danger" label outline v-bind="labelIcon"/>
          <c-switch checked class="mx-1" color="light" label outline v-bind="labelIcon"/>
          <c-switch checked class="mx-1" color="dark" label outline v-bind="labelIcon"/>
          <c-switch class="mx-1" color="primary" disabled label outline v-bind="labelIcon"/>
        </b-card>
      </b-col>
      <b-col md="6" xs="12">
        <b-card>
          <div slot="header">
            Switch
            <small><code>label outline</code></small>
          </div>
          <c-switch checked class="mx-1" color="primary" label outline v-bind="labelIcon" variant="pill"/>
          <c-switch checked class="mx-1" color="secondary" label outline v-bind="labelIcon" variant="pill"/>
          <c-switch checked class="mx-1" color="success" label outline v-bind="labelIcon" variant="pill"/>
          <c-switch checked class="mx-1" color="warning" label outline v-bind="labelIcon" variant="pill"/>
          <c-switch checked class="mx-1" color="info" label outline v-bind="labelIcon" variant="pill"/>
          <c-switch checked class="mx-1" color="danger" label outline v-bind="labelIcon" variant="pill"/>
          <c-switch checked class="mx-1" color="light" label outline v-bind="labelIcon" variant="pill"/>
          <c-switch checked class="mx-1" color="dark" label outline v-bind="labelIcon" variant="pill"/>
          <c-switch class="mx-1" color="primary" disabled label outline v-bind="labelIcon" variant="pill"/>
        </b-card>
      </b-col>
      <b-col md="6" xs="12">
        <b-card>
          <div slot="header">
            Switch
            <small><code>label outline</code></small>
          </div>
          <c-switch checked class="mx-1" color="primary" label outline="alt" v-bind="labelIcon"/>
          <c-switch checked class="mx-1" color="secondary" label outline="alt" v-bind="labelIcon"/>
          <c-switch checked class="mx-1" color="success" label outline="alt" v-bind="labelIcon"/>
          <c-switch checked class="mx-1" color="warning" label outline="alt" v-bind="labelIcon"/>
          <c-switch checked class="mx-1" color="info" label outline="alt" v-bind="labelIcon"/>
          <c-switch checked class="mx-1" color="danger" label outline="alt" v-bind="labelIcon"/>
          <c-switch checked class="mx-1" color="light" label outline="alt" v-bind="labelIcon"/>
          <c-switch checked class="mx-1" color="dark" label outline="alt" v-bind="labelIcon"/>
          <c-switch class="mx-1" color="primary" disabled label outline="alt" v-bind="labelIcon"/>
        </b-card>
      </b-col>
      <b-col md="6" xs="12">
        <b-card>
          <div slot="header">
            Switch
            <small><code>label outline</code></small>
          </div>
          <c-switch checked class="mx-1" color="primary" label outline="alt" v-bind="labelTxt" variant="pill"/>
          <c-switch checked class="mx-1" color="secondary" label outline="alt" v-bind="labelIcon" variant="pill"/>
          <c-switch checked class="mx-1" color="success" label outline="alt" v-bind="labelIcon" variant="pill"/>
          <c-switch checked class="mx-1" color="warning" label outline="alt" v-bind="labelIcon" variant="pill"/>
          <c-switch checked class="mx-1" color="info" label outline="alt" v-bind="labelIcon" variant="pill"/>
          <c-switch checked class="mx-1" color="danger" label outline="alt" v-bind="labelIcon" variant="pill"/>
          <c-switch checked class="mx-1" color="light" label outline="alt" v-bind="labelIcon" variant="pill"/>
          <c-switch checked class="mx-1" color="dark" label outline="alt" v-bind="labelIcon" variant="pill"/>
          <c-switch class="mx-1" color="primary" disabled label outline="alt" v-bind="labelIcon" variant="pill"/>
        </b-card>
      </b-col>

      <b-col md="12">
        <b-card no-body>
          <div slot="header">
            Sizes
          </div>
          <b-card-body class="p-0">
            <b-table :fields="fields" :items="items" class="table-align-middle mb-0" hover responsive="sm" striped>
              <template slot="example" slot-scope="data">
                <c-switch :checked="data.value.checked" :color="data.value.color" :size="data.value.size"
                          :variant="data.value.variant"/>
              </template>
              <template slot="size_prop" slot-scope="data">
                <span v-html="data.item.size_prop"></span>
              </template>
            </b-table>
          </b-card-body>
        </b-card>
      </b-col>
    </b-row>
  </div>
</template>

<script>
  import {Switch as cSwitch} from '@coreui/vue'

  export default {
    name: 'switches',
    components: {
      cSwitch
    },
    data: () => {
      return {
        fields: [
          {key: 'size'},
          {key: 'example'},
          {key: 'size_prop', label: 'Size prop'}
        ],
        items: [
          {
            size: 'Large',
            example: {variant: '3d', color: 'primary', size: 'lg', checked: true},
            size_prop: 'Add following prop <code>size="lg"</code>'
          },
          {size: 'Normal', example: {variant: '3d', color: 'primary', size: '', checked: true}, size_prop: '-'},
          {
            size: 'Small',
            example: {variant: '3d', color: 'primary', size: 'sm', checked: true},
            size_prop: 'Add following prop <code>size="sm"</code>'
          }
        ],
        checker: 'yes',
        picker: '',
        labelIcon: {
          dataOn: '\u2713',
          dataOff: '\u2715'
        },
        labelTxt: {
          dataOn: 'yes',
          dataOff: 'no'
        }
      }
    }
  }
</script>
