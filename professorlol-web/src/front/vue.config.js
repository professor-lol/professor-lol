const path = require('path');
const BACKEND_RESOURCE_DIR = 'main/resources/'
const BACKEND_RESOURCE_PATH = path.resolve(__dirname, "../" + BACKEND_RESOURCE_DIR)
const BACKEND_RESOURCE_STATIC_DIR = 'static'
const BACKEND_RESOURCE_INDEX_PATH = path.resolve(__dirname, "../" + BACKEND_RESOURCE_DIR + "/" + BACKEND_RESOURCE_STATIC_DIR + "/index.html")


const port = 8090;
const proxyPort = 8080;


module.exports = {
  outputDir: BACKEND_RESOURCE_PATH,
  indexPath: BACKEND_RESOURCE_INDEX_PATH,
  assetsDir: BACKEND_RESOURCE_STATIC_DIR,
  devServer: {
    port: port,
    open: true,
    overlay: {
      warnings: false,
      errors: true
    },
    proxy: {
      '/api': {
        target: `http://localhost:${proxyPort}`,
        ws: false
      },
      '/oauth2': {
        target: `http://localhost:${proxyPort}`,
        ws: false
      }
    }
  },
}

