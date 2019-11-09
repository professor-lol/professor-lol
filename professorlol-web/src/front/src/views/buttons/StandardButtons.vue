<template>
  <div class="animated fadeIn">
    <b-card no-body>
      <b-card-header>
        <strong>Standard buttons</strong>
      </b-card-header>
      <b-card-body>
        <b-row class="align-items-center">
          <b-col class="mb-3 mb-xl-0" cols="12" xl>
            Normal
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block variant="primary">Primary</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block variant="secondary">Secondary</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block variant="success">Success</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block variant="warning">Warning</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block variant="danger">Danger</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block variant="info">Info</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block variant="light">Light</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block variant="dark">Dark</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block variant="link">Link</b-button>
          </b-col>
        </b-row>
        <b-row class="align-items-center mt-3">
          <b-col class="mb-3 mb-xl-0" cols="12" xl>
            Active State
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block pressed variant="primary">Primary</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block pressed variant="secondary">Secondary</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block pressed variant="success">Success</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block pressed variant="warning">Warning</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block pressed variant="danger">Danger</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block pressed variant="info">Info</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block pressed variant="light">Light</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block pressed variant="dark">Dark</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block pressed variant="link">Link</b-button>
          </b-col>
        </b-row>
        <b-row class="align-items-center mt-3">
          <b-col class="mb-3 mb-xl-0" cols="12" xl>
            Disabled
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block disabled variant="primary">Primary</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block disabled variant="secondary">Secondary</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block disabled variant="success">Success</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block disabled variant="warning">Warning</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block disabled variant="danger">Danger</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block disabled variant="info">Info</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block disabled variant="light">Light</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block disabled variant="dark">Dark</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block disabled variant="link">Link</b-button>
          </b-col>
        </b-row>
      </b-card-body>
    </b-card>
    <b-card no-body>
      <b-card-header>
        <strong>Outline Buttons</strong>
      </b-card-header>
      <b-card-body>
        <p>
          Use <code>variant="outline-*"</code> prop
        </p>
        <b-row class="align-items-center">
          <b-col class="mb-3 mb-xl-0" cols="12" xl>
            Normal
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block variant="outline-primary">Primary</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block variant="outline-secondary">Secondary</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block variant="outline-success">Success</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block variant="outline-warning">Warning</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block variant="outline-danger">Danger</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block variant="outline-info">Info</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block variant="outline-light">Light</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block variant="outline-dark">Dark</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl></b-col>
        </b-row>
        <b-row class="align-items-center mt-3">
          <b-col class="mb-3 mb-xl-0" cols="12" xl>
            Active State
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block pressed variant="outline-primary">Primary</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block pressed variant="outline-secondary">Secondary</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block pressed variant="outline-success">Success</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block pressed variant="outline-warning">Warning</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block pressed variant="outline-danger">Danger</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block pressed variant="outline-info">Info</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block pressed variant="outline-light">Light</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block pressed variant="outline-dark">Dark</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl></b-col>
        </b-row>
        <b-row class="align-items-center mt-3">
          <b-col class="mb-3 mb-xl-0" cols="12" xl>
            Disabled
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block disabled variant="outline-primary">Primary</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block disabled variant="outline-secondary">Secondary</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block disabled variant="outline-success">Success</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block disabled variant="outline-warning">Warning</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block disabled variant="outline-danger">Danger</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block disabled variant="outline-info">Info</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block disabled variant="outline-light">Light</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block disabled variant="outline-dark">Dark</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl></b-col>
        </b-row>
      </b-card-body>
    </b-card>
    <b-card no-body>
      <b-card-header>
        <strong>Ghost Buttons</strong>
      </b-card-header>
      <b-card-body>
        <p>
          Use
          <code>.btn-ghost-*</code> class for ghost buttons.
        </p>
        <b-row class="align-items-center">
          <b-col class="mb-3 mb-xl-0" cols="12" xl>
            Normal
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block variant="ghost-primary">Primary</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block variant="ghost-secondary">Secondary</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block variant="ghost-success">Success</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block variant="ghost-warning">Warning</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block variant="ghost-danger">Danger</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block variant="ghost-info">Info</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block variant="ghost-light">Light</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block variant="ghost-dark">Dark</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl></b-col>
        </b-row>
        <b-row class="align-items-center mt-3">
          <b-col class="mb-3 mb-xl-0" cols="12" xl>
            Active State
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block pressed variant="ghost-primary">Primary</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block pressed variant="ghost-secondary">Secondary</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block pressed variant="ghost-success">Success</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block pressed variant="ghost-warning">Warning</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block pressed variant="ghost-danger">Danger</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block pressed variant="ghost-info">Info</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block pressed variant="ghost-light">Light</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block pressed variant="ghost-dark">Dark</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl></b-col>
        </b-row>
        <b-row class="align-items-center mt-3">
          <b-col class="mb-3 mb-xl-0" cols="12" xl>
            Disabled
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block disabled variant="ghost-primary">Primary</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block disabled variant="ghost-secondary">Secondary</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block disabled variant="ghost-success">Success</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block disabled variant="ghost-warning">Warning</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block disabled variant="ghost-danger">Danger</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block disabled variant="ghost-info">Info</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block disabled variant="ghost-light">Light</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block disabled variant="ghost-dark">Dark</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl></b-col>
        </b-row>
      </b-card-body>
    </b-card>
    <b-card no-body>
      <b-card-header>
        <strong>Square Buttons</strong>
      </b-card-header>
      <b-card-body>
        <p>
          Use
          <code>.btn-square</code> class for square buttons.
        </p>
        <b-row class="align-items-center">
          <b-col class="mb-3 mb-xl-0" cols="12" xl>
            Normal
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block class="btn-square" variant="primary">Primary</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block class="btn-square" variant="secondary">Secondary</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block class="btn-square" variant="success">Success</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block class="btn-square" variant="warning">Warning</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block class="btn-square" variant="danger">Danger</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block class="btn-square" variant="info">Info</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block class="btn-square" variant="light">Light</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block class="btn-square" variant="dark">Dark</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block class="btn-square" variant="link">Link</b-button>
          </b-col>
        </b-row>
        <b-row class="align-items-center mt-3">
          <b-col class="mb-3 mb-xl-0" cols="12" xl>
            Active State
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block class="btn-square" pressed variant="primary">Primary</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block class="btn-square" pressed variant="secondary">Secondary</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block class="btn-square" pressed variant="success">Success</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block class="btn-square" pressed variant="warning">Warning</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block class="btn-square" pressed variant="danger">Danger</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block class="btn-square" pressed variant="info">Info</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block class="btn-square" pressed variant="light">Light</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block class="btn-square" pressed variant="dark">Dark</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block class="btn-square" pressed variant="link">Link</b-button>
          </b-col>
        </b-row>
        <b-row class="align-items-center mt-3">
          <b-col class="mb-3 mb-xl-0" cols="12" xl>
            Disabled
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block class="btn-square" disabled variant="primary">Primary</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block class="btn-square" disabled variant="secondary">Secondary</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block class="btn-square" disabled variant="success">Success</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block class="btn-square" disabled variant="warning">Warning</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block class="btn-square" disabled variant="danger">Danger</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block class="btn-square" disabled variant="info">Info</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block class="btn-square" disabled variant="light">Light</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block class="btn-square" disabled variant="dark">Dark</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block class="btn-square" disabled variant="link">Link</b-button>
          </b-col>
        </b-row>
      </b-card-body>
    </b-card>
    <b-card no-body>
      <b-card-header>
        <strong>Pill Buttons</strong>
      </b-card-header>
      <b-card-body>
        <p>
          Use
          <code>.btn-pill</code> class for pill buttons.
        </p>
        <b-row class="align-items-center">
          <b-col class="mb-3 mb-xl-0" cols="12" xl>
            Normal
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block class="btn-pill" variant="primary">Primary</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block class="btn-pill" variant="secondary">Secondary</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block class="btn-pill" variant="success">Success</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block class="btn-pill" variant="warning">Warning</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block class="btn-pill" variant="danger">Danger</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block class="btn-pill" variant="info">Info</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block class="btn-pill" variant="light">Light</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block class="btn-pill" variant="dark">Dark</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block class="btn-pill" variant="link">Link</b-button>
          </b-col>
        </b-row>
        <b-row class="align-items-center mt-3">
          <b-col class="mb-3 mb-xl-0" cols="12" xl>
            Active State
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block class="btn-pill" pressed variant="primary">Primary</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block class="btn-pill" pressed variant="secondary">Secondary</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block class="btn-pill" pressed variant="success">Success</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block class="btn-pill" pressed variant="warning">Warning</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block class="btn-pill" pressed variant="danger">Danger</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block class="btn-pill" pressed variant="info">Info</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block class="btn-pill" pressed variant="light">Light</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block class="btn-pill" pressed variant="dark">Dark</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button aria-pressed="true" block class="btn-pill" pressed variant="link">Link</b-button>
          </b-col>
        </b-row>
        <b-row class="align-items-center mt-3">
          <b-col class="mb-3 mb-xl-0" cols="12" xl>
            Disabled
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block class="btn-pill" disabled variant="primary">Primary</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block class="btn-pill" disabled variant="secondary">Secondary</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block class="btn-pill" disabled variant="success">Success</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block class="btn-pill" disabled variant="warning">Warning</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block class="btn-pill" disabled variant="danger">Danger</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block class="btn-pill" disabled variant="info">Info</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block class="btn-pill" disabled variant="light">Light</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block class="btn-pill" disabled variant="dark">Dark</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0" cols="6" md="2" sm="4" xl>
            <b-button block class="btn-pill" disabled variant="link">Link</b-button>
          </b-col>
        </b-row>
      </b-card-body>
    </b-card>
    <b-card no-body>
      <b-card-header>
        <strong>Sizes</strong>
      </b-card-header>
      <b-card-body>
        <p>Fancy larger or smaller buttons? Add <code>size="lg"</code> or <code>size="sm"</code> for additional sizes.
        </p>
        <b-row class="align-items-center">
          <b-col class="mb-3 mb-xl-0" cols="2" xl>
            Small
          </b-col>
          <b-col class="mb-3 mb-xl-0 text-center" cols="2">
            <b-button size="sm" variant="primary">Standard Button</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0 text-center" cols="2">
            <b-button size="sm" variant="outline-secondary">Outline Button</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0 text-center" cols="2">
            <b-button size="sm" variant="ghost-success">Ghost Button</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0 text-center" cols="2">
            <b-button class="btn-square" size="sm" variant="warning">Square Button</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0 text-center" cols="2">
            <b-button class="btn-pill" size="sm" variant="danger">Pill Button</b-button>
          </b-col>
        </b-row>
        <b-row class="align-items-center mt-3">
          <b-col class="mb-3 mb-xl-0" cols="2" xl>
            Normal
          </b-col>
          <b-col class="mb-3 mb-xl-0 text-center" cols="2">
            <b-button variant="primary">Standard Button</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0 text-center" cols="2">
            <b-button variant="outline-secondary">Outline Button</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0 text-center" cols="2">
            <b-button variant="ghost-success">Ghost Button</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0 text-center" cols="2">
            <b-button class="btn-square" variant="warning">Square Button</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0 text-center" cols="2">
            <b-button class="btn-pill" variant="danger">Pill Button</b-button>
          </b-col>
        </b-row>
        <b-row class="align-items-center mt-3">
          <b-col class="mb-3 mb-xl-0" cols="2" xl>
            Large
          </b-col>
          <b-col class="mb-3 mb-xl-0 text-center" cols="2">
            <b-button size="lg" variant="primary">Standard Button</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0 text-center" cols="2">
            <b-button size="lg" variant="outline-secondary">Outline Button</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0 text-center" cols="2">
            <b-button size="lg" variant="ghost-success">Ghost Button</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0 text-center" cols="2">
            <b-button class="btn-square" size="lg" variant="warning">Square Button</b-button>
          </b-col>
          <b-col class="mb-3 mb-xl-0 text-center" cols="2">
            <b-button class="btn-pill" size="lg" variant="danger">Pill Button</b-button>
          </b-col>
        </b-row>
      </b-card-body>
    </b-card>
    <b-card no-body>
      <b-card-header>
        <strong>With Icons</strong>
      </b-card-header>
      <b-card-body>
        <b-row class="align-items-center mt-3">
          <b-col class="text-center mt-3" sm xs="12">
            <b-button variant="primary">
              <i class="fa fa-lightbulb-o"></i>&nbsp;Standard Button
            </b-button>
          </b-col>
          <b-col class="text-center mt-3" sm xs="12">
            <b-button outline variant="secondary">
              <i class="fa fa-lightbulb-o"></i>&nbsp;Outline Button
            </b-button>
          </b-col>
          <b-col class="text-center mt-3" sm xs="12">
            <b-button variant="ghost-success">
              <i class="fa fa-lightbulb-o"></i>&nbsp;Ghost Button
            </b-button>
          </b-col>
          <b-col class="text-center mt-3" sm xs="12">
            <b-button class="btn-square" variant="warning">
              <i class="fa fa-lightbulb-o"></i>&nbsp;Square Button
            </b-button>
          </b-col>
          <b-col class="text-center mt-3" sm xs="12">
            <b-button class="btn-pill" variant="danger">
              <i class="fa fa-lightbulb-o"></i>&nbsp;Pill Button
            </b-button>
          </b-col>
        </b-row>
      </b-card-body>
    </b-card>
    <b-card>
      <div slot="header">
        <strong>Toggle pressed state</strong>
      </div>
      <b-row>
        <b-col class="text-center mt-3" sm xs="12">
          <b-button :pressed.sync="togglePress" variant="outline-primary">Primary {{togglePress ? 'On ' : 'Off'}}
          </b-button>
        </b-col>
        <b-col class="text-center mt-3" sm xs="12">
          <b-button :pressed.sync="togglePress" variant="outline-secondary">Secondary {{togglePress ? 'On ' : 'Off'}}
          </b-button>
        </b-col>
        <b-col class="text-center mt-3" sm xs="12">
          <b-button :pressed.sync="togglePress" variant="outline-success">Success {{togglePress ? 'On ' : 'Off'}}
          </b-button>
        </b-col>
        <b-col class="text-center mt-3" sm xs="12">
          <b-button :pressed.sync="togglePress" variant="outline-info">Info {{togglePress ? 'On ' : 'Off'}}</b-button>
        </b-col>
        <b-col class="text-center mt-3" sm xs="12">
          <b-button :pressed.sync="togglePress" variant="outline-warning">Warning {{togglePress ? 'On ' : 'Off'}}
          </b-button>
        </b-col>
        <b-col class="text-center mt-3" sm xs="12">
          <b-button :pressed.sync="togglePress" variant="outline-danger">Danger {{togglePress ? 'On ' : 'Off'}}
          </b-button>
        </b-col>
      </b-row>
    </b-card>
    <b-row>
      <b-col md="6" xs="12">
        <b-card>
          <div slot="header">
            <strong>Block Level b-buttons</strong>
            <small>Add this <code>block</code></small>
          </div>
          <b-button block size="lg" variant="secondary">Block level button</b-button>
          <b-button block size="lg" variant="primary">Block level button</b-button>
          <b-button block size="lg" variant="success">Block level button</b-button>
          <b-button block size="lg" variant="info">Block level button</b-button>
          <b-button block size="lg" variant="warning">Block level button</b-button>
          <b-button block size="lg" variant="danger">Block level button</b-button>
          <b-button block size="lg" variant="link">Block level button</b-button>
        </b-card>
      </b-col>
      <b-col md="6" xs="12">
        <b-card>
          <div slot="header">
            <strong>Block Level b-buttons</strong>
            <small>Add this <code>block</code></small>
          </div>
          <b-button block size="lg" variant="outline-secondary">Block level button</b-button>
          <b-button block size="lg" variant="outline-primary">Block level button</b-button>
          <b-button block size="lg" variant="outline-success">Block level button</b-button>
          <b-button block size="lg" variant="outline-info">Block level button</b-button>
          <b-button block size="lg" variant="outline-warning">Block level button</b-button>
          <b-button block size="lg" variant="outline-danger">Block level button</b-button>
          <b-button block size="lg" variant="ghost-info">Block level button</b-button>
        </b-card>
      </b-col>
    </b-row>
  </div>
</template>

<script>
  export default {
    name: 'standard-buttons',
    data: () => {
      return {togglePress: false}
    }
  }
</script>

<style scoped>
  .btn.disabled {
    cursor: auto;
  }
</style>
