const port = 8090;
const proxyPort = 8080;


module.exports = {
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
            '/oauth2':{
                target: `http://localhost:${proxyPort}`,
                ws: false
            }
        }
    },
}