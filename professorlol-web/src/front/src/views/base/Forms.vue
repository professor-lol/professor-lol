<template>
  <div class="animated fadeIn">
    <b-row>
      <b-col sm="6">
        <b-card>
          <div slot="header">
            <strong>Credit Card </strong>
            <small>Form</small>
          </div>
          <b-row>
            <b-col sm="12">
              <b-form-group>
                <label for="name">Name</label>
                <b-form-input id="name" placeholder="Enter your name" type="text"></b-form-input>
              </b-form-group>
            </b-col>
          </b-row>
          <b-row>
            <b-col sm="12">
              <b-form-group>
                <label for="ccnumber">Credit Card Number</label>
                <b-form-input id="ccnumber" placeholder="0000 0000 0000 0000" type="text"></b-form-input>
              </b-form-group>
            </b-col>
          </b-row>
          <b-row>
            <b-col sm="4">
              <b-form-group>
                <label for="month1">Month</label>
                <b-form-select :options="[1,2,3,4,5,6,7,8,9,10,11,12]"
                               :plain="true"
                               id="month1">
                </b-form-select>
              </b-form-group>
            </b-col>
            <b-col sm="4">
              <b-form-group>
                <label for="year1">Year</label>
                <b-form-select :options="[2014,2015,2016,2017,2018,2019,2020,2021,2022,2023,2024,2025]"
                               :plain="true"
                               id="year1">
                </b-form-select>
              </b-form-group>
            </b-col>
            <b-col sm="4">
              <b-form-group>
                <label for="cvv">CVV/CVC</label>
                <b-form-input id="cvv" placeholder="123" type="text"></b-form-input>
              </b-form-group>
            </b-col>
          </b-row>
        </b-card>
      </b-col>
      <b-col sm="6">
        <b-card>
          <div slot="header">
            <strong>Company </strong>
            <small>Form</small>
          </div>
          <b-form-group>
            <label for="company">Company</label>
            <b-form-input id="company" placeholder="Enter your company name" type="text"></b-form-input>
          </b-form-group>
          <b-form-group>
            <label for="vat">VAT</label>
            <b-form-input id="vat" placeholder="PL1234567890" type="text"></b-form-input>
          </b-form-group>
          <b-form-group>
            <label for="street">Street</label>
            <b-form-input id="street" placeholder="Enter street name" type="text"></b-form-input>
          </b-form-group>
          <b-row>
            <b-col sm="8">
              <b-form-group>
                <label for="city">City</label>
                <b-form-input id="city" placeholder="Enter your city" type="text"></b-form-input>
              </b-form-group>
            </b-col>
            <b-col sm="4">
              <b-form-group>
                <label for="postal-code">Postal Code</label>
                <b-form-input id="postal-code" placeholder="Postal Code" type="text"></b-form-input>
              </b-form-group>
            </b-col>
          </b-row>
          <b-form-group>
            <label for="country">Country</label>
            <b-form-input id="country" placeholder="Country name" type="text"></b-form-input>
          </b-form-group>
        </b-card>
      </b-col>
    </b-row>
    <b-row>
      <b-col md="6">
        <b-card>
          <div slot="header">
            <strong>Basic Form</strong> Elements
          </div>
          <b-form>
            <b-form-group
              :label-cols="3"
              description="Let us know your full name."
              label="Enter your name"
              label-for="basicName"
            >
              <b-form-input autocomplete="name" id="basicName" type="text"></b-form-input>
            </b-form-group>
            <b-form-group
              :label-cols="3"
              label="Static"
              label-for="basicStatic"
            >
              <b-form-input id="basicStatic" plaintext type="text" value="Username"></b-form-input>
            </b-form-group>
            <b-form-group
              :label-cols="3"
              description="This is a help text"
              label="Text Input"
              label-for="basicText"
            >
              <b-form-input id="basicText" placeholder="Text" type="text"></b-form-input>
            </b-form-group>
            <b-form-group
              :label-cols="3" label="Date"
              label-for="date"
            >
              <b-form-input id="date" type="date"></b-form-input>
            </b-form-group>
            <b-form-group
              :label-cols="3"
              description="Please enter your email"
              label="Email Input"
              label-for="basicEmail"
            >
              <b-form-input autocomplete="email" id="basicEmail" placeholder="Enter your email"
                            type="email"></b-form-input>
            </b-form-group>
            <b-form-group
              :label-cols="3"
              description="Please enter a complex password"
              label="Password Input"
              label-for="basicPassword"
            >
              <b-form-input autocomplete="current-password" id="basicPassword" placeholder="Enter your password"
                            type="password"></b-form-input>
            </b-form-group>
            <b-form-group
              :label-cols="3"
              label="Disabled Input"
              label-for="basicInputDisabled"
            >
              <b-form-input :disabled="true" id="basicInputDisabled" placeholder="Disabled" type="text"></b-form-input>
            </b-form-group>
            <b-form-group
              :label-cols="3"
              label="Textarea"
              label-for="basicTextarea"
            >
              <b-form-textarea :rows="9" id="basicTextarea" placeholder="Content.."></b-form-textarea>
            </b-form-group>
            <b-form-group
              :label-cols="3"
              label="Select"
              label-for="basicSelect"
            >
              <b-form-select :options="['Please select','Option 1', 'Option 2', 'Option 3']"
                             :plain="true"
                             id="basicSelect"
                             value="Please select">
              </b-form-select>
            </b-form-group>
            <b-form-group
              :label-cols="3"
              label="Select large"
              label-for="basicSelectLg"
            >
              <b-form-select :options="['Please select','Option 1', 'Option 2', 'Option 3']"
                             :plain="true"
                             id="basicSelectLg"
                             size="lg"
                             value="Please select">
              </b-form-select>
            </b-form-group>
            <b-form-group
              :label-cols="3"
              label="Select small"
              label-for="basicSelectSm"
            >
              <b-form-select :options="['Please select','Option 1', 'Option 2', 'Option 3']"
                             :plain="true"
                             id="basicSelectSm"
                             size="sm"
                             value="Please select">
              </b-form-select>
            </b-form-group>
            <b-form-group
              :label-cols="3"
              label="Disabled select"
              label-for="basicSelectDisabled"
            >
              <b-form-select :disabled="true"
                             :options="['Please select','Option 1', 'Option 2', 'Option 3']"
                             :plain="true"
                             id="basicSelectDisabled"
                             value="Please select">
              </b-form-select>
            </b-form-group>
            <b-form-group
              :label-cols="3"
              label="Select"
              label-for="basicMultiSelect"
            >
              <b-form-select :multiple="true"
                             :options="[
                {
                  text: 'Please select some item',
                  value: null
                },
                {
                  text: 'This is First option',
                  value: 'a'
                }, {
                  text: 'Default Selected Option',
                  value: 'b'
                }, {
                  text: 'This is another option',
                  value: 'c'
                }, {
                  text: 'This one is disabled',
                  value: 'd',
                  disabled: true
                }]"
                             :plain="true"
                             :value="[null,'c']"
                             id="basicMultiSelect">
              </b-form-select>
            </b-form-group>
            <b-form-group
              :label-cols="3"
              label="Radios"
              label-for="basicRadios"
            >
              <b-form-radio-group :options="[
                {text: 'Option 1 ',value: '1'},
                {text: 'Option 2 ',value: '2'},
                {text: 'Option 3 ',value: '3'}
              ]"
                                  :plain="true"
                                  checked="2"
                                  id="basicRadios"
                                  stacked>
              </b-form-radio-group>
            </b-form-group>
            <b-form-group
              :label-cols="3"
              label="Inline radios"
              label-for="basicInlineRadios"
            >
              <b-form-radio-group :checked="3"
                                  :options="[
                {text: 'Option 1 ',value: '1'},
                {text: 'Option 2 ',value: '2'},
                {text: 'Option 3 ',value: '3'}
              ]"
                                  :plain="true"
                                  id="basicInlineRadios">
              </b-form-radio-group>
            </b-form-group>

            <b-form-group
              :label-cols="3"
              label="Checkboxes"
              label-for="basicCheckboxes"
            >
              <b-form-checkbox-group :checked="[2,3]" :plain="true" id="basicCheckboxes" name="Checkboxes" stacked>
                <b-form-checkbox value="1">Option 1</b-form-checkbox>
                <b-form-checkbox value="2">Option 2</b-form-checkbox>
                <b-form-checkbox value="3">Option 3</b-form-checkbox>
              </b-form-checkbox-group>
            </b-form-group>
            <b-form-group
              :label-cols="3"
              label="Inline checkboxes"
              label-for="basicInlineCheckboxes"
            >
              <b-form-checkbox-group :checked="[1,3]" :plain="true" id="basicInlineCheckboxes" name="InlineCheckboxes">
                <b-form-checkbox :plain="true" value="1">Option 1</b-form-checkbox>
                <b-form-checkbox :plain="true" value="2">Option 2</b-form-checkbox>
                <b-form-checkbox :plain="true" value="3">Option 3</b-form-checkbox>
              </b-form-checkbox-group>
            </b-form-group>
            <!--custom controls - radios/checkboxes - temporary fix-->
            <b-form-group
              :label-cols="3"
              label="Radios - custom"
              label-for="basicRadiosCustom"
            >
              <b-form-radio-group
                id="basicRadiosCustom"
                stacked
                value="1">
                <div class="custom-control custom-radio">
                  <input class="custom-control-input" id="customRadio1" name="customRadio" type="radio" value="1">
                  <label class="custom-control-label" for="customRadio1">Option 1</label>
                </div>
                <div class="custom-control custom-radio">
                  <input checked class="custom-control-input" id="customRadio2" name="customRadio" type="radio"
                         value="2">
                  <label class="custom-control-label" for="customRadio2">Option 2</label>
                </div>
                <div class="custom-control custom-radio">
                  <input class="custom-control-input" id="customRadio3" name="customRadio" type="radio" value="3">
                  <label class="custom-control-label" for="customRadio3">Option 3</label>
                </div>
              </b-form-radio-group>
            </b-form-group>
            <b-form-group
              :label-cols="3"
              label="Inline radios - custom"
              label-for="basicCustomRadios1"
            >
              <b-form-radio-group
                id="basicCustomRadios1"
                name="customRadioInline1">
                <div class="custom-control custom-radio custom-control-inline">
                  <input class="custom-control-input" id="customRadioInline1" name="customRadioInline1" type="radio"
                         value="1">
                  <label class="custom-control-label" for="customRadioInline1">Option 1</label>
                </div>
                <div class="custom-control custom-radio custom-control-inline">
                  <input checked class="custom-control-input" id="customRadioInline2" name="customRadioInline1"
                         type="radio" value="2">
                  <label class="custom-control-label" for="customRadioInline2">Option 2</label>
                </div>
                <div class="custom-control custom-radio custom-control-inline">
                  <input class="custom-control-input" id="customRadioInline3" name="customRadioInline1" type="radio"
                         value="3">
                  <label class="custom-control-label" for="customRadioInline3">Option 3</label>
                </div>
              </b-form-radio-group>
            </b-form-group>
            <b-form-group
              :label-cols="3"
              label="Checkboxes - custom"
              label-for="basicCustomCheckboxes"
            >
              <b-form-checkbox-group id="basicCustomCheckboxes" stacked>
                <div class="custom-control custom-checkbox">
                  <input checked class="custom-control-input" id="customChk1" type="checkbox" value="1">
                  <label class="custom-control-label" for="customChk1">Option 1</label>
                </div>
                <div class="custom-control custom-checkbox">
                  <input class="custom-control-input" id="customChk2" type="checkbox" value="2">
                  <label class="custom-control-label" for="customChk2">Option 2</label>
                </div>
                <div class="custom-control custom-checkbox">
                  <input class="custom-control-input" id="customChk3" type="checkbox" value="3">
                  <label class="custom-control-label" for="customChk3">Option 3</label>
                </div>
              </b-form-checkbox-group>
            </b-form-group>
            <b-form-group
              :label-cols="3"
              label="Inline checkboxes - custom"
              label-for="basicInlineCustomCheckboxes"
            >
              <b-form-checkbox-group id="basicInlineCustomCheckboxes">
                <div class="custom-control custom-checkbox custom-control-inline">
                  <input class="custom-control-input" id="customInChk1" type="checkbox" value="1">
                  <label class="custom-control-label" for="customInChk1">Option 1</label>
                </div>
                <div class="custom-control custom-checkbox custom-control-inline">
                  <input checked class="custom-control-input" id="customInChk2" type="checkbox" value="2">
                  <label class="custom-control-label" for="customInChk2">Option 2</label>
                </div>
                <div class="custom-control custom-checkbox custom-control-inline">
                  <input class="custom-control-input" id="customInChk3" type="checkbox" value="3">
                  <label class="custom-control-label" for="customInChk3">Option 3</label>
                </div>
              </b-form-checkbox-group>
            </b-form-group>
            <b-form-group
              :label-cols="3"
              label="File input"
              label-for="fileInput"
            >
              <b-form-file :plain="true" id="fileInput"></b-form-file>
            </b-form-group>
            <b-form-group
              :label-cols="3"
              label="Multiple file input"
              label-for="fileInputMulti"
            >
              <b-form-file :multiple="true" :plain="true" id="fileInputMulti"></b-form-file>
            </b-form-group>
            <div slot="footer">
              <b-button size="sm" type="submit" variant="primary"><i class="fa fa-dot-circle-o"></i> Submit</b-button>
              <b-button size="sm" type="reset" variant="danger"><i class="fa fa-ban"></i> Reset</b-button>
            </div>
          </b-form>
        </b-card>
        <b-card>
          <div slot="header">
            <strong>Inline</strong> Form
          </div>
          <!-- Bootstrap Vue has some problems with Inline forms that's why we use some standard bootstrap classes -->
          <b-form inline>
            <label class="mr-sm-2" for="inlineInput1">Name: </label>
            <b-input id="inlineInput1" placeholder="Jane Doe" type="text"></b-input>
            <label class="mx-sm-2" for="inlineInput2">Email: </label>
            <b-input autocomplete="email" id="inlineInput2" placeholder="jane.doe@example.com" type="email"></b-input>
          </b-form>
          <div slot="footer">
            <b-button size="sm" type="submit" variant="primary"><i class="fa fa-dot-circle-o"></i> Submit</b-button>
            <b-button size="sm" type="reset" variant="danger"><i class="fa fa-ban"></i> Reset</b-button>
          </div>
        </b-card>
      </b-col>
      <b-col md="6">
        <b-card>
          <div slot="header">
            <strong>Horizontal</strong> Form
          </div>
          <b-form>
            <b-form-group
              :label-cols="3"
              description="Please enter your email."
              label="Email"
              label-for="horizEmail"
            >
              <b-form-input autocomplete="username email" id="horizEmail" placeholder="Enter Email.."
                            type="email"></b-form-input>
            </b-form-group>
            <b-form-group
              :label-cols="3"
              description="Please enter your password."
              label="Password"
              label-for="horizPass"
            >
              <b-form-input autocomplete="current-password" id="horizPass" placeholder="Enter Password.."
                            type="password"></b-form-input>
            </b-form-group>
            <div slot="footer">
              <b-button size="sm" type="submit" variant="primary"><i class="fa fa-dot-circle-o"></i> Submit</b-button>
              <b-button size="sm" type="reset" variant="danger"><i class="fa fa-ban"></i> Reset</b-button>
            </div>
          </b-form>
        </b-card>
        <b-card>
          <div slot="header">
            <strong>Normal</strong> Form
          </div>
          <b-form>
            <b-form-group description="Please enter your email."
                          label="Email"
                          label-for="normalEmail"
                          validated>
              <b-form-input autocomplete="email" id="normalEmail" placeholder="Enter Email.." required
                            type="email"></b-form-input>
            </b-form-group>
            <b-form-group description="Please enter your password."
                          label="Password"
                          label-for="normalPass"
                          validated>
              <b-form-input autocomplete="current-password" id="normalPass" placeholder="Enter Password.." required
                            type="password"></b-form-input>
            </b-form-group>
            <div slot="footer">
              <b-button size="sm" type="submit" variant="primary"><i class="fa fa-dot-circle-o"></i> Submit</b-button>
              <b-button size="sm" type="reset" variant="danger"><i class="fa fa-ban"></i> Reset</b-button>
            </div>
          </b-form>
        </b-card>
        <b-card :no-block="true" no-body>
          <div slot="header">
            Input <strong>Grid</strong>
          </div>
          <b-card-body>
            <b-row class="form-group">
              <b-col sm="3">
                <b-form-input placeholder=".col-sm-3" type="text"></b-form-input>
              </b-col>
            </b-row>
            <b-row class="form-group">
              <b-col sm="4">
                <b-form-input placeholder=".col-sm-4" type="text"></b-form-input>
              </b-col>
            </b-row>
            <b-row class="form-group">
              <b-col sm="5">
                <b-form-input placeholder=".col-sm-5" type="text"></b-form-input>
              </b-col>
            </b-row>
            <b-row class="form-group">
              <b-col sm="6">
                <b-form-input placeholder=".col-sm-6" type="text"></b-form-input>
              </b-col>
            </b-row>
            <b-row class="form-group">
              <b-col sm="7">
                <b-form-input placeholder=".col-sm-7" type="text"></b-form-input>
              </b-col>
            </b-row>
            <b-row class="form-group">
              <b-col sm="8">
                <b-form-input placeholder=".col-sm-8" type="text"></b-form-input>
              </b-col>
            </b-row>
            <b-row class="form-group">
              <b-col sm="9">
                <b-form-input placeholder=".col-sm-9" type="text"></b-form-input>
              </b-col>
            </b-row>
            <b-row class="form-group">
              <b-col sm="10">
                <b-form-input placeholder=".col-sm-10" type="text"></b-form-input>
              </b-col>
            </b-row>
            <b-row class="form-group">
              <b-col sm="11">
                <b-form-input placeholder=".col-sm-11" type="text"></b-form-input>
              </b-col>
            </b-row>
            <b-row class="form-group">
              <b-col sm="12">
                <b-form-input placeholder=".col-sm-12" type="text"></b-form-input>
              </b-col>
            </b-row>
          </b-card-body>
          <div slot="footer">
            <b-button size="sm" type="submit" variant="primary"><i class="fa fa-user"></i> Login</b-button>
            <b-button size="sm" type="reset" variant="danger"><i class="fa fa-ban"></i> Reset</b-button>
          </div>
        </b-card>
        <b-card>
          <div slot="header">
            Input <strong>Sizes</strong>
          </div>
          <b-form-group
            :label-cols="5"
            label="Small input"
            label-for="smInput"
            label-size="sm"
          >
            <b-form-input id="smInput" placeholder="size='sm'" size="sm" type="text"></b-form-input>
          </b-form-group>
          <b-form-group
            :label-cols="5"
            label="Default input"
            label-for="defaultInput"
          >
            <b-form-input id="defaultInput" placeholder="normal" type="text"></b-form-input>
          </b-form-group>
          <b-form-group
            :label-cols="5"
            label="Large input"
            label-for="lgInput"
            label-size="lg"
          >
            <b-form-input id="lgInput" placeholder="size='lg'" size="lg" type="text"></b-form-input>
          </b-form-group>
          <div slot="footer">
            <b-button size="sm" type="submit" variant="primary"><i class="fa fa-dot-circle-o"></i> Submit</b-button>
            <b-button size="sm" type="reset" variant="danger"><i class="fa fa-ban"></i> Reset</b-button>
          </div>
        </b-card>
      </b-col>
    </b-row>
    <b-row>
      <b-col md="6" sm="12">
        <b-card :no-block="true" no-body>
          <div slot="header">
            <strong>Validation feedback</strong> Form
          </div>
          <b-card-body>
            <b-form>
              <b-form-group validated>
                <label class="col-form-label" for="inputIsValid">Input is valid</label>
                <input class="form-control is-valid" id="inputIsValid" type="text">
                <b-form-valid-feedback>
                  Input is valid.
                </b-form-valid-feedback>
              </b-form-group>
              <b-form-group>
                <label class="col-form-label" for="inputIsInvalid">Input is invalid</label>
                <input class="form-control is-invalid" id="inputIsInvalid" type="text">
                <b-form-invalid-feedback>
                  Please provide a valid information.
                </b-form-invalid-feedback>
              </b-form-group>
            </b-form>
          </b-card-body>
        </b-card>
      </b-col>
      <b-col md="6" sm="12">
        <b-card :no-block="true" no-body>
          <div slot="header">
            <strong>Validation feedback</strong> Form
          </div>
          <b-card-body>
            <b-form novalidate validated>
              <b-form-group label="Non-required input" label-for="inputSuccess2">
                <b-form-input class="form-control-success" id="inputSuccess2" type="text"></b-form-input>
                <b-form-valid-feedback>
                  Input is not required.
                </b-form-valid-feedback>
              </b-form-group>
              <b-form-group label="Required input" label-for="inputError2">
                <b-form-input class="form-control-warning" id="inputError2" required type="text"></b-form-input>
                <b-form-valid-feedback>
                  Input provided.
                </b-form-valid-feedback>
                <b-form-invalid-feedback>
                  Please provide a required input.
                </b-form-invalid-feedback>
              </b-form-group>
            </b-form>
          </b-card-body>
        </b-card>
      </b-col>
    </b-row>
    <b-row>
      <b-col md="4">
        <b-card>
          <div slot="header">
            <strong>Icon/Text</strong> Groups
          </div>
          <b-form-group>
            <b-input-group>
              <b-input-group-prepend>
                <b-input-group-text><i class="fa fa-user"></i></b-input-group-text>
              </b-input-group-prepend>
              <b-form-input placeholder="Username" type="text"></b-form-input>
            </b-input-group>
          </b-form-group>
          <b-form-group>
            <b-input-group>
              <b-form-input autocomplete="email" placeholder="Email" type="email"></b-form-input>
              <b-input-group-append>
                <b-input-group-text><i class="fa fa-envelope-o"></i></b-input-group-text>
              </b-input-group-append>
            </b-input-group>
          </b-form-group>
          <b-form-group>
            <b-input-group>
              <b-input-group-prepend>
                <b-input-group-text><i class="fa fa-euro"></i></b-input-group-text>
              </b-input-group-prepend>
              <b-form-input placeholder="ex. $1.000.000" type="text"></b-form-input>
              <b-input-group-append>
                <b-input-group-text>.00</b-input-group-text>
              </b-input-group-append>
            </b-input-group>
          </b-form-group>
          <div slot="footer">
            <b-button size="sm" type="submit" variant="success"><i class="fa fa-dot-circle-o"></i> Submit</b-button>
            <b-button size="sm" type="reset" variant="danger"><i class="fa fa-ban"></i> Reset</b-button>
          </div>
        </b-card>
      </b-col>
      <b-col md="4">
        <b-card>
          <div slot="header">
            <strong>Buttons</strong> Groups
          </div>
          <b-form-group>
            <b-input-group>
              <!-- Attach Left button -->
              <b-input-group-prepend>
                <b-button variant="primary">
                  <i class="fa fa-search"></i> Search
                </b-button>
              </b-input-group-prepend>
              <b-form-input placeholder="Username" type="text"></b-form-input>
            </b-input-group>
          </b-form-group>
          <b-form-group>
            <b-input-group>
              <b-form-input autocomplete="email" placeholder="Email" type="email"></b-form-input>
              <!-- Attach Right button -->
              <b-input-group-append>
                <b-button variant="primary">Submit</b-button>
              </b-input-group-append>
            </b-input-group>
          </b-form-group>
          <b-form-group>
            <b-input-group>
              <!-- Attach Left button -->
              <b-input-group-prepend>
                <b-button variant="primary"><i class="fa fa-facebook"></i></b-button>
              </b-input-group-prepend>
              <b-form-input autocomplete="email" placeholder="Email" type="email"></b-form-input>
              <!-- Attach Left button -->
              <b-input-group-append>
                <b-button variant="primary"><i class="fa fa-twitter"></i></b-button>
              </b-input-group-append>
            </b-input-group>
          </b-form-group>
          <div slot="footer">
            <b-button size="sm" type="submit" variant="success"><i class="fa fa-dot-circle-o"></i> Submit</b-button>
            <b-button size="sm" type="reset" variant="danger"><i class="fa fa-ban"></i> Reset</b-button>
          </div>
        </b-card>
      </b-col>
      <b-col md="4">
        <b-card>
          <div slot="header">
            <strong>Dropdowns</strong> Groups
          </div>
          <b-form-group>
            <b-input-group>
              <!-- Attach Left button -->
              <b-input-group-prepend>
                <b-dropdown text="Action" variant="primary">
                  <b-dropdown-item>Action</b-dropdown-item>
                  <b-dropdown-item>Another action</b-dropdown-item>
                  <b-dropdown-item>Something else here...</b-dropdown-item>
                  <b-dropdown-item disabled>Disabled action</b-dropdown-item>
                </b-dropdown>
              </b-input-group-prepend>
              <b-form-input placeholder="Username"></b-form-input>
            </b-input-group>
          </b-form-group>
          <b-form-group>
            <b-input-group>
              <b-form-input placeholder="Email"></b-form-input>
              <!-- Attach Right button -->
              <b-input-group-append>
                <b-dropdown right text="Action" variant="primary">
                  <b-dropdown-item>Action</b-dropdown-item>
                  <b-dropdown-item>Another action</b-dropdown-item>
                  <b-dropdown-item>Something else here...</b-dropdown-item>
                  <b-dropdown-item disabled>Disabled action</b-dropdown-item>
                </b-dropdown>
              </b-input-group-append>
            </b-input-group>
          </b-form-group>
          <b-form-group>
            <b-input-group>
              <!-- Attach Left button -->
              <b-input-group-prepend>
                <b-dropdown split text="Split" variant="primary">
                  <b-dropdown-item href="#">Action</b-dropdown-item>
                  <b-dropdown-item href="#">Another action</b-dropdown-item>
                  <b-dropdown-item href="#">Something else here...</b-dropdown-item>
                  <b-dropdown-item disabled>Disabled action</b-dropdown-item>
                </b-dropdown>
              </b-input-group-prepend>
              <b-form-input placeholder="..."></b-form-input>
              <!-- Attach Right button -->
              <b-input-group-append>
                <b-dropdown right text="Action" variant="primary">
                  <b-dropdown-item>Action</b-dropdown-item>
                  <b-dropdown-item>Another action</b-dropdown-item>
                  <b-dropdown-item>Something else here...</b-dropdown-item>
                  <b-dropdown-item disabled>Disabled action</b-dropdown-item>
                </b-dropdown>
              </b-input-group-append>
            </b-input-group>
          </b-form-group>
          <div slot="footer">
            <b-button size="sm" type="submit" variant="success"><i class="fa fa-dot-circle-o"></i> Submit</b-button>
            <b-button size="sm" type="reset" variant="danger"><i class="fa fa-ban"></i> Reset</b-button>
          </div>
        </b-card>
      </b-col>
    </b-row>
    <b-row>
      <b-col md="6">
        <b-card>
          <div slot="header">
            Use the grid for big devices!
            <small><code>.col-lg-*</code> <code>.col-md-*</code> <code>.col-sm-*</code></small>
          </div>
          <b-row class="form-group">
            <b-col md="8">
              <b-form-input placeholder=".col-md-8" type="text"></b-form-input>
            </b-col>
            <b-col md="4">
              <b-form-input placeholder=".col-md-4" type="text"></b-form-input>
            </b-col>
          </b-row>
          <b-row class="form-group">
            <b-col md="7">
              <b-form-input placeholder=".col-md-7" type="text"></b-form-input>
            </b-col>
            <b-col md="5">
              <b-form-input placeholder=".col-md-5" type="text"></b-form-input>
            </b-col>
          </b-row>
          <b-row class="form-group">
            <b-col md="6">
              <b-form-input placeholder=".col-md-6" type="text"></b-form-input>
            </b-col>
            <b-col md="6">
              <b-form-input placeholder=".col-md-6" type="text"></b-form-input>
            </b-col>
          </b-row>
          <b-row class="form-group">
            <b-col md="5">
              <b-form-input placeholder=".col-md-5" type="text"></b-form-input>
            </b-col>
            <b-col md="7">
              <b-form-input placeholder=".col-md-7" type="text"></b-form-input>
            </b-col>
          </b-row>
          <b-row class="form-group">
            <b-col md="4">
              <b-form-input placeholder=".col-md-4" type="text"></b-form-input>
            </b-col>
            <b-col md="8">
              <b-form-input placeholder=".col-md-8" type="text"></b-form-input>
            </b-col>
          </b-row>
          <div slot="footer">
            <b-button size="sm" type="submit" variant="primary">Action</b-button>
            <b-button size="sm" type="button" variant="danger">Action</b-button>
            <b-button class="btn btn-sm btn-warning" type="button">Action</b-button>
            <b-button class="btn btn-sm btn-info" type="button">Action</b-button>
            <b-button size="sm" type="button" variant="success">Action</b-button>
          </div>
        </b-card>
      </b-col>
      <b-col md="6">
        <b-card>
          <div slot="header">
            Input Grid for small devices!
            <small><code>.col-*</code></small>
          </div>
          <b-row class="form-group">
            <b-col cols="4">
              <b-form-input placeholder=".col-4" type="text"></b-form-input>
            </b-col>
            <b-col cols="8">
              <b-form-input placeholder=".col-8" type="text"></b-form-input>
            </b-col>
          </b-row>
          <b-row class="form-group">
            <b-col cols="5">
              <b-form-input placeholder=".col-5" type="text"></b-form-input>
            </b-col>
            <b-col cols="7">
              <b-form-input placeholder=".col-7" type="text"></b-form-input>
            </b-col>
          </b-row>
          <b-row class="form-group">
            <b-col cols="6">
              <b-form-input placeholder=".col-6" type="text"></b-form-input>
            </b-col>
            <b-col cols="6">
              <b-form-input placeholder=".col-6" type="text"></b-form-input>
            </b-col>
          </b-row>
          <b-row class="form-group">
            <b-col cols="7">
              <b-form-input placeholder=".col-5" type="text"></b-form-input>
            </b-col>
            <b-col cols="5">
              <b-form-input placeholder=".col-5" type="text"></b-form-input>
            </b-col>
          </b-row>
          <b-row class="form-group">
            <b-col cols="8">
              <b-form-input placeholder=".col-8" type="text"></b-form-input>
            </b-col>
            <b-col cols="4">
              <b-form-input placeholder=".col-4" type="text"></b-form-input>
            </b-col>
          </b-row>
          <div slot="footer">
            <b-button size="sm" type="submit" variant="primary">Action</b-button>
            <b-button size="sm" type="button" variant="danger">Action</b-button>
            <b-button class="btn btn-sm btn-warning" type="button">Action</b-button>
            <b-button class="btn btn-sm btn-info" type="button">Action</b-button>
            <b-button size="sm" type="button" variant="success">Action</b-button>
          </div>
        </b-card>
      </b-col>
    </b-row>
    <b-row>
      <b-col md="4">
        <b-card>
          <div slot="header">
            Example Form
          </div>
          <b-form>
            <b-form-group>
              <b-input-group>
                <b-input-group-prepend>
                  <b-input-group-text>Username</b-input-group-text>
                </b-input-group-prepend>
                <b-form-input type="text"></b-form-input>
                <b-input-group-append>
                  <b-input-group-text><i class="fa fa-user"></i></b-input-group-text>
                </b-input-group-append>
              </b-input-group>
            </b-form-group>
            <b-form-group>
              <b-input-group>
                <b-input-group-prepend>
                  <b-input-group-text>Email</b-input-group-text>
                </b-input-group-prepend>
                <b-form-input autocomplete="email" type="email"></b-form-input>
                <b-input-group-append>
                  <b-input-group-text><i class="fa fa-envelope"></i></b-input-group-text>
                </b-input-group-append>
              </b-input-group>
            </b-form-group>
            <b-form-group>
              <b-input-group>
                <b-input-group-prepend>
                  <b-input-group-text>Password</b-input-group-text>
                </b-input-group-prepend>
                <b-form-input autocomplete="current-password" type="password"></b-form-input>
                <b-input-group-append>
                  <b-input-group-text><i class="fa fa-asterisk"></i></b-input-group-text>
                </b-input-group-append>
              </b-input-group>
            </b-form-group>
            <div class="form-group form-actions">
              <b-button size="sm" type="submit" variant="primary">Submit</b-button>
            </div>
          </b-form>
        </b-card>
      </b-col>
      <b-col md="4">
        <b-card>
          <div slot="header">
            Example Form
          </div>
          <b-form>
            <b-form-group>
              <b-input-group>
                <b-form-input placeholder="Username" type="text"></b-form-input>
                <b-input-group-append>
                  <b-input-group-text><i class="fa fa-user"></i></b-input-group-text>
                </b-input-group-append>
              </b-input-group>
            </b-form-group>
            <b-form-group>
              <b-input-group>
                <b-form-input autocomplete="email" placeholder="Email" type="email"></b-form-input>
                <b-input-group-append>
                  <b-input-group-text><i class="fa fa-envelope"></i></b-input-group-text>
                </b-input-group-append>
              </b-input-group>
            </b-form-group>
            <b-form-group>
              <b-input-group>
                <b-form-input autocomplete="current-password" placeholder="Password" type="password"></b-form-input>
                <b-input-group-append>
                  <b-input-group-text><i class="fa fa-asterisk"></i></b-input-group-text>
                </b-input-group-append>
              </b-input-group>
            </b-form-group>
            <div class="form-group form-actions">
              <b-button class="btn btn-sm btn-secondary" type="submit">Submit</b-button>
            </div>
          </b-form>
        </b-card>
      </b-col>
      <b-col md="4">
        <b-card>
          <div slot="header">
            Example Form
          </div>
          <b-form>
            <b-form-group>
              <b-input-group>
                <b-input-group-prepend>
                  <b-input-group-text><i class="fa fa-user"></i></b-input-group-text>
                </b-input-group-prepend>
                <b-form-input placeholder="Username" type="text"></b-form-input>
              </b-input-group>
            </b-form-group>
            <b-form-group>
              <b-input-group>
                <b-input-group-prepend>
                  <b-input-group-text><i class="fa fa-envelope"></i></b-input-group-text>
                </b-input-group-prepend>
                <b-form-input autocomplete="email" placeholder="Email" type="email"></b-form-input>
              </b-input-group>
            </b-form-group>
            <b-form-group>
              <b-input-group>
                <b-input-group-prepend>
                  <b-input-group-text><i class="fa fa-asterisk"></i></b-input-group-text>
                </b-input-group-prepend>
                <b-form-input autocomplete="current-password" placeholder="Password" type="password"></b-form-input>
              </b-input-group>
            </b-form-group>
            <div class="form-group form-actions">
              <b-button size="sm" type="submit" variant="success">Submit</b-button>
            </div>
          </b-form>
        </b-card>
      </b-col>
    </b-row>
    <b-row>
      <b-col lg="12">
        <transition name="fade">
          <b-card no-body v-if="show">
            <div slot="header">
              <i class="fa fa-edit"></i> Form Elements
              <div class="card-header-actions">
                <b-link class="card-header-action btn-setting" href="#">
                  <i class="icon-settings"></i>
                </b-link>
                <b-link class="card-header-action btn-minimize" v-b-toggle.collapse1>
                  <i class="icon-arrow-up"></i>
                </b-link>
                <b-link class="card-header-action btn-close" href="#" v-on:click="show = !show">
                  <i class="icon-close"></i>
                </b-link>
              </div>
            </div>
            <b-collapse id="collapse1" visible>
              <b-card-body>
                <b-form-group description="Here's some help text" label="Prepended text" label-for="elementsEmail">
                  <b-input-group>
                    <b-input-group-prepend>
                      <b-input-group-text>@</b-input-group-text>
                    </b-input-group-prepend>
                    <b-form-input autocomplete="email" id="elementsEmail" type="email"></b-form-input>
                  </b-input-group>
                </b-form-group>
                <b-form-group description="Here's some help text" label="Appended text" label-for="elementsAppend">
                  <b-input-group>
                    <b-form-input id="elementsAppend" type="text"></b-form-input>
                    <b-input-group-append>
                      <b-input-group-text>.00</b-input-group-text>
                    </b-input-group-append>
                  </b-input-group>
                </b-form-group>
                <b-form-group description="Here's some help text" label="Append and prepend"
                              label-for="elementsPrependAppend">
                  <b-input-group>
                    <b-input-group-prepend>
                      <b-input-group-text>$</b-input-group-text>
                    </b-input-group-prepend>
                    <b-form-input id="elementsPrependAppend" type="text"></b-form-input>
                    <b-input-group-append>
                      <b-input-group-text>.00</b-input-group-text>
                    </b-input-group-append>
                  </b-input-group>
                </b-form-group>
                <b-form-group description="Here's some help text" label="Append with button"
                              label-for="elementsAppendButton">
                  <b-input-group>
                    <b-form-input id="elementsAppendButton" type="text"></b-form-input>
                    <b-input-group-append>
                      <b-button variant="primary">Go!</b-button>
                    </b-input-group-append>
                  </b-input-group>
                </b-form-group>
                <b-form-group label="Two-buttons append" label-for="elementsTwoButtons">
                  <b-input-group>
                    <b-form-input id="elementsTwoButtons" type="text"></b-form-input>
                    <b-input-group-append>
                      <b-button variant="primary">Search</b-button>
                      <b-button variant="danger">Options</b-button>
                    </b-input-group-append>
                  </b-input-group>
                </b-form-group>
                <div class="form-actions">
                  <b-button type="submit" variant="primary">Save changes</b-button>
                  <b-button type="button" variant="secondary">Cancel</b-button>
                </div>
              </b-card-body>
            </b-collapse>
          </b-card>
        </transition>
      </b-col>
    </b-row>
  </div>
</template>

<script>
  export default {
    name: 'forms',
    data() {
      return {
        selected: [], // Must be an array reference!
        show: true
      }
    },
    methods: {
      click() {
        // do nothing
      }
    }
  }
</script>

<style scoped>
  .fade-enter-active,
  .fade-leave-active {
    transition: opacity 0.5s;
  }

  .fade-enter,
  .fade-leave-to {
    opacity: 0;
  }
</style>
