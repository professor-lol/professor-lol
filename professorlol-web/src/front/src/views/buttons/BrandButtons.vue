<template>
  <div class="animated fadeIn">
    <b-row>
      <b-col cols="12">
        <b-card>
          <div slot="header">
            <strong>Brand Button</strong>
          </div>
          <small>Usage</small>
          <code style="text-transform:lowercase">&lt;b-button variant="facebook"&gt;&lt;span&gt;Facebook&lt;/span&gt;&lt;/b-button&gt;</code>
          <hr/>
          <h6>Size Small
            <small>Add <code>size="sm"</code></small>
          </h6>
          <p>
            <b-button class="mr-1 btn-brand" size="sm" variant="facebook"><i
              class="fa fa-facebook"></i><span>Facebook</span></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="twitter"><i
              class="fa fa-twitter"></i><span>Twitter</span></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="linkedin"><i
              class="fa fa-linkedin"></i><span>LinkedIn</span></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="flickr"><i class="fa fa-flickr"></i><span>Flickr</span>
            </b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="tumblr"><i class="fa fa-tumblr"></i><span>Tumblr</span>
            </b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="xing"><i class="fa fa-xing"></i><span>Xing</span>
            </b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="github"><i class="fa fa-github"></i><span>Github</span>
            </b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="html5"><i class="fa fa-html5"></i><span>HTML5</span>
            </b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="openid"><i class="fa fa-openid"></i><span>OpenID</span>
            </b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="stack-overflow"><i
              class="fa fa-stack-overflow"></i><span>StackOverflow</span></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="css3"><i class="fa fa-css3"></i><span>CSS3</span>
            </b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="youtube"><i
              class="fa fa-youtube"></i><span>YouTube</span></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="dribbble"><i
              class="fa fa-dribbble"></i><span>Dribbble</span></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="google-plus"><i class="fa fa-google-plus"></i><span>Google+</span>
            </b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="instagram"><i class="fa fa-instagram"></i><span>Instagram</span>
            </b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="pinterest"><i class="fa fa-pinterest"></i><span>Pinterest</span>
            </b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="vk"><i class="fa fa-vk"></i><span>VK</span></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="yahoo"><i class="fa fa-yahoo"></i><span>Yahoo</span>
            </b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="behance"><i
              class="fa fa-behance"></i><span>Behance</span></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="dropbox"><i
              class="fa fa-dropbox"></i><span>Dropbox</span></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="reddit"><i class="fa fa-reddit"></i><span>Reddit</span>
            </b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="spotify"><i
              class="fa fa-spotify"></i><span>Spotify</span></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="vine"><i class="fa fa-vine"></i><span>Vine</span>
            </b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="foursquare"><i class="fa fa-foursquare"></i><span>Forsquare</span>
            </b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="vimeo"><i class="fa fa-vimeo"></i><span>Vimeo</span>
            </b-button>
          </p>
          <h6>Size Normal</h6>
          <p>
            <b-button class="mr-1 btn-brand" variant="facebook"><i class="fa fa-facebook"></i><span>Facebook</span>
            </b-button>
            <b-button class="mr-1 btn-brand" variant="twitter"><i class="fa fa-twitter"></i><span>Twitter</span>
            </b-button>
            <b-button class="mr-1 btn-brand" variant="linkedin"><i class="fa fa-linkedin"></i><span>LinkedIn</span>
            </b-button>
            <b-button class="mr-1 btn-brand" variant="flickr"><i class="fa fa-flickr"></i><span>Flickr</span></b-button>
            <b-button class="mr-1 btn-brand" variant="tumblr"><i class="fa fa-tumblr"></i><span>Tumblr</span></b-button>
            <b-button class="mr-1 btn-brand" variant="xing"><i class="fa fa-xing"></i><span>Xing</span></b-button>
            <b-button class="mr-1 btn-brand" variant="github"><i class="fa fa-github"></i><span>Github</span></b-button>
            <b-button class="mr-1 btn-brand" variant="html5"><i class="fa fa-html5"></i><span>HTML5</span></b-button>
            <b-button class="mr-1 btn-brand" variant="openid"><i class="fa fa-openid"></i><span>OpenID</span></b-button>
            <b-button class="mr-1 btn-brand" variant="stack-overflow"><i class="fa fa-stack-overflow"></i><span>StackOverflow</span>
            </b-button>
            <b-button class="mr-1 btn-brand" variant="css3"><i class="fa fa-css3"></i><span>CSS3</span></b-button>
            <b-button class="mr-1 btn-brand" variant="youtube"><i class="fa fa-youtube"></i><span>YouTube</span>
            </b-button>
            <b-button class="mr-1 btn-brand" variant="dribbble"><i class="fa fa-dribbble"></i><span>Dribbble</span>
            </b-button>
            <b-button class="mr-1 btn-brand" variant="google-plus"><i class="fa fa-google-plus"></i><span>Google+</span>
            </b-button>
            <b-button class="mr-1 btn-brand" variant="instagram"><i class="fa fa-instagram"></i><span>Instagram</span>
            </b-button>
            <b-button class="mr-1 btn-brand" variant="pinterest"><i class="fa fa-pinterest"></i><span>Pinterest</span>
            </b-button>
            <b-button class="mr-1 btn-brand" variant="vk"><i class="fa fa-vk"></i><span>VK</span></b-button>
            <b-button class="mr-1 btn-brand" variant="yahoo"><i class="fa fa-yahoo"></i><span>Yahoo</span></b-button>
            <b-button class="mr-1 btn-brand" variant="behance"><i class="fa fa-behance"></i><span>Behance</span>
            </b-button>
            <b-button class="mr-1 btn-brand" variant="dropbox"><i class="fa fa-dropbox"></i><span>Dropbox</span>
            </b-button>
            <b-button class="mr-1 btn-brand" variant="reddit"><i class="fa fa-reddit"></i><span>Reddit</span></b-button>
            <b-button class="mr-1 btn-brand" variant="spotify"><i class="fa fa-spotify"></i><span>Spotify</span>
            </b-button>
            <b-button class="mr-1 btn-brand" variant="vine"><i class="fa fa-vine"></i><span>Vine</span></b-button>
            <b-button class="mr-1 btn-brand" variant="foursquare"><i class="fa fa-foursquare"></i><span>Forsquare</span>
            </b-button>
            <b-button class="mr-1 btn-brand" variant="vimeo"><i class="fa fa-vimeo"></i><span>Vimeo</span></b-button>
          </p>
          <h6>Size Large
            <small>Add <code>size="lg"</code></small>
          </h6>
          <p>
            <b-button class="mr-1 btn-brand" size="lg" variant="facebook"><i
              class="fa fa-facebook"></i><span>Facebook</span></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="twitter"><i
              class="fa fa-twitter"></i><span>Twitter</span></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="linkedin"><i
              class="fa fa-linkedin"></i><span>LinkedIn</span></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="flickr"><i class="fa fa-flickr"></i><span>Flickr</span>
            </b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="tumblr"><i class="fa fa-tumblr"></i><span>Tumblr</span>
            </b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="xing"><i class="fa fa-xing"></i><span>Xing</span>
            </b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="github"><i class="fa fa-github"></i><span>Github</span>
            </b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="html5"><i class="fa fa-html5"></i><span>HTML5</span>
            </b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="openid"><i class="fa fa-openid"></i><span>OpenID</span>
            </b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="stack-overflow"><i
              class="fa fa-stack-overflow"></i><span>StackOverflow</span></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="css3"><i class="fa fa-css3"></i><span>CSS3</span>
            </b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="youtube"><i
              class="fa fa-youtube"></i><span>YouTube</span></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="dribbble"><i
              class="fa fa-dribbble"></i><span>Dribbble</span></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="google-plus"><i class="fa fa-google-plus"></i><span>Google+</span>
            </b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="instagram"><i class="fa fa-instagram"></i><span>Instagram</span>
            </b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="pinterest"><i class="fa fa-pinterest"></i><span>Pinterest</span>
            </b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="vk"><i class="fa fa-vk"></i><span>VK</span></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="yahoo"><i class="fa fa-yahoo"></i><span>Yahoo</span>
            </b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="behance"><i
              class="fa fa-behance"></i><span>Behance</span></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="dropbox"><i
              class="fa fa-dropbox"></i><span>Dropbox</span></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="reddit"><i class="fa fa-reddit"></i><span>Reddit</span>
            </b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="spotify"><i
              class="fa fa-spotify"></i><span>Spotify</span></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="vine"><i class="fa fa-vine"></i><span>Vine</span>
            </b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="foursquare"><i class="fa fa-foursquare"></i><span>Forsquare</span>
            </b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="vimeo"><i class="fa fa-vimeo"></i><span>Vimeo</span>
            </b-button>
          </p>
        </b-card>
      </b-col><!--/.col-->
      <b-col cols="12">
        <b-card>
          <div slot="header">
            <strong>Brand Button </strong>
            <small>Icons only</small>
          </div>
          <small>Usage</small>
          <code style="text-transform:lowercase">&lt;b-button variant="facebook icon"&gt;&lt;span&gt;Facebook&lt;/span&gt;&lt;/b-button&gt;</code>
          <hr/>
          <h6>Size Small
            <small>Add <code>size="sm"</code></small>
          </h6>
          <p>
            <b-button class="mr-1 btn-brand" size="sm" variant="facebook icon"><i class="fa fa-facebook"></i></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="twitter icon"><i class="fa fa-twitter"></i></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="linkedin icon"><i class="fa fa-linkedin"></i></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="flickr icon"><i class="fa fa-flickr"></i></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="tumblr icon"><i class="fa fa-tumblr"></i></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="xing icon"><i class="fa fa-xing"></i></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="github icon"><i class="fa fa-github"></i></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="html5 icon"><i class="fa fa-html5"></i></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="openid icon"><i class="fa fa-openid"></i></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="stack-overflow icon"><i
              class="fa fa-stack-overflow"></i></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="css3 icon"><i class="fa fa-css3"></i></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="youtube icon"><i class="fa fa-youtube"></i></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="dribbble icon"><i class="fa fa-dribbble"></i></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="google-plus icon"><i class="fa fa-google-plus"></i>
            </b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="instagram icon"><i class="fa fa-instagram"></i>
            </b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="pinterest icon"><i class="fa fa-pinterest"></i>
            </b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="vk icon"><i class="fa fa-vk"></i></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="yahoo icon"><i class="fa fa-yahoo"></i></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="behance icon"><i class="fa fa-behance"></i></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="dropbox icon"><i class="fa fa-dropbox"></i></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="reddit icon"><i class="fa fa-reddit"></i></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="spotify icon"><i class="fa fa-spotify"></i></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="vine icon"><i class="fa fa-vine"></i></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="foursquare icon"><i class="fa fa-foursquare"></i>
            </b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="vimeo icon"><i class="fa fa-vimeo"></i></b-button>
          </p>
          <h6>Size Normal</h6>
          <p>
            <b-button class="mr-1 btn-brand" variant="facebook icon"><i class="fa fa-facebook"></i></b-button>
            <b-button class="mr-1 btn-brand" variant="twitter icon"><i class="fa fa-twitter"></i></b-button>
            <b-button class="mr-1 btn-brand" variant="linkedin icon"><i class="fa fa-linkedin"></i></b-button>
            <b-button class="mr-1 btn-brand" variant="flickr icon"><i class="fa fa-flickr"></i></b-button>
            <b-button class="mr-1 btn-brand" variant="tumblr icon"><i class="fa fa-tumblr"></i></b-button>
            <b-button class="mr-1 btn-brand" variant="xing icon"><i class="fa fa-xing"></i></b-button>
            <b-button class="mr-1 btn-brand" variant="github icon"><i class="fa fa-github"></i></b-button>
            <b-button class="mr-1 btn-brand" variant="html5 icon"><i class="fa fa-html5"></i></b-button>
            <b-button class="mr-1 btn-brand" variant="openid icon"><i class="fa fa-openid"></i></b-button>
            <b-button class="mr-1 btn-brand" variant="stack-overflow icon"><i class="fa fa-stack-overflow"></i>
            </b-button>
            <b-button class="mr-1 btn-brand" variant="css3 icon"><i class="fa fa-css3"></i></b-button>
            <b-button class="mr-1 btn-brand" variant="youtube icon"><i class="fa fa-youtube"></i></b-button>
            <b-button class="mr-1 btn-brand" variant="dribbble icon"><i class="fa fa-dribbble"></i></b-button>
            <b-button class="mr-1 btn-brand" variant="google-plus icon"><i class="fa fa-google-plus"></i></b-button>
            <b-button class="mr-1 btn-brand" variant="instagram icon"><i class="fa fa-instagram"></i></b-button>
            <b-button class="mr-1 btn-brand" variant="pinterest icon"><i class="fa fa-pinterest"></i></b-button>
            <b-button class="mr-1 btn-brand" variant="vk icon"><i class="fa fa-vk"></i></b-button>
            <b-button class="mr-1 btn-brand" variant="yahoo icon"><i class="fa fa-yahoo"></i></b-button>
            <b-button class="mr-1 btn-brand" variant="behance icon"><i class="fa fa-behance"></i></b-button>
            <b-button class="mr-1 btn-brand" variant="dropbox icon"><i class="fa fa-dropbox"></i></b-button>
            <b-button class="mr-1 btn-brand" variant="reddit icon"><i class="fa fa-reddit"></i></b-button>
            <b-button class="mr-1 btn-brand" variant="spotify icon"><i class="fa fa-spotify"></i></b-button>
            <b-button class="mr-1 btn-brand" variant="vine icon"><i class="fa fa-vine"></i></b-button>
            <b-button class="mr-1 btn-brand" variant="foursquare icon"><i class="fa fa-foursquare"></i></b-button>
            <b-button class="mr-1 btn-brand" variant="vimeo icon"><i class="fa fa-vimeo"></i></b-button>
          </p>
          <h6>Size Large
            <small>Add <code>size="lg"</code></small>
          </h6>
          <p>
            <b-button class="mr-1 btn-brand" size="lg" variant="facebook icon"><i class="fa fa-facebook"></i></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="twitter icon"><i class="fa fa-twitter"></i></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="linkedin icon"><i class="fa fa-linkedin"></i></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="flickr icon"><i class="fa fa-flickr"></i></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="tumblr icon"><i class="fa fa-tumblr"></i></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="xing icon"><i class="fa fa-xing"></i></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="github icon"><i class="fa fa-github"></i></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="html5 icon"><i class="fa fa-html5"></i></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="openid icon"><i class="fa fa-openid"></i></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="stack-overflow icon"><i
              class="fa fa-stack-overflow"></i></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="css3 icon"><i class="fa fa-css3"></i></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="youtube icon"><i class="fa fa-youtube"></i></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="dribbble icon"><i class="fa fa-dribbble"></i></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="google-plus icon"><i class="fa fa-google-plus"></i>
            </b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="instagram icon"><i class="fa fa-instagram"></i>
            </b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="pinterest icon"><i class="fa fa-pinterest"></i>
            </b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="vk icon"><i class="fa fa-vk"></i></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="yahoo icon"><i class="fa fa-yahoo"></i></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="behance icon"><i class="fa fa-behance"></i></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="dropbox icon"><i class="fa fa-dropbox"></i></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="reddit icon"><i class="fa fa-reddit"></i></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="spotify icon"><i class="fa fa-spotify"></i></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="vine icon"><i class="fa fa-vine"></i></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="foursquare icon"><i class="fa fa-foursquare"></i>
            </b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="vimeo icon"><i class="fa fa-vimeo"></i></b-button>
          </p>
        </b-card>
      </b-col><!--/.col-->

      <b-col cols="12">
        <b-card>
          <div slot="header">
            <strong>Brand Button </strong>
            <small>Text only</small>
          </div>
          <small>Usage</small>
          <code style="text-transform:lowercase">&lt;b-button variant="facebook text"&gt;&lt;span&gt;Facebook&lt;/span&gt;&lt;/b-button&gt;</code>
          <hr/>
          <h6>Size Small
            <small>Add <code>size="sm"</code></small>
          </h6>
          <p>
            <b-button class="mr-1 btn-brand" size="sm" variant="facebook text"><span>Facebook</span></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="twitter text"><span>Twitter</span></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="linkedin text"><span>LinkedIn</span></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="flickr text"><span>Flickr</span></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="tumblr text"><span>Tumblr</span></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="xing text"><span>Xing</span></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="github text"><span>Github</span></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="html5 text"><span>HTML5</span></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="openid text"><span>OpenID</span></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="stack-overflow text"><span>StackOverflow</span>
            </b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="css3 text"><span>CSS3</span></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="youtube text"><span>YouTube</span></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="dribbble text"><span>Dribbble</span></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="google-plus text"><span>Google+</span></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="instagram text"><span>Instagram</span></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="pinterest text"><span>Pinterest</span></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="vk text"><span>VK</span></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="yahoo text"><span>Yahoo</span></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="behance text"><span>Behance</span></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="dropbox text"><span>Dropbox</span></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="reddit text"><span>Reddit</span></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="spotify text"><span>Spotify</span></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="vine text"><span>Vine</span></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="foursquare text"><span>Forsquare</span></b-button>
            <b-button class="mr-1 btn-brand" size="sm" variant="vimeo text"><span>Vimeo</span></b-button>
          </p>
          <h6>Size Normal</h6>
          <p>
            <b-button class="mr-1 btn-brand" variant="facebook text"><span>Facebook</span></b-button>
            <b-button class="mr-1 btn-brand" variant="twitter text"><span>Twitter</span></b-button>
            <b-button class="mr-1 btn-brand" variant="linkedin text"><span>LinkedIn</span></b-button>
            <b-button class="mr-1 btn-brand" variant="flickr text"><span>Flickr</span></b-button>
            <b-button class="mr-1 btn-brand" variant="tumblr text"><span>Tumblr</span></b-button>
            <b-button class="mr-1 btn-brand" variant="xing text"><span>Xing</span></b-button>
            <b-button class="mr-1 btn-brand" variant="github text"><span>Github</span></b-button>
            <b-button class="mr-1 btn-brand" variant="html5 text"><span>HTML5</span></b-button>
            <b-button class="mr-1 btn-brand" variant="openid text"><span>OpenID</span></b-button>
            <b-button class="mr-1 btn-brand" variant="stack-overflow text"><span>StackOverflow</span></b-button>
            <b-button class="mr-1 btn-brand" variant="css3 text"><span>CSS3</span></b-button>
            <b-button class="mr-1 btn-brand" variant="youtube text"><span>YouTube</span></b-button>
            <b-button class="mr-1 btn-brand" variant="dribbble text"><span>Dribbble</span></b-button>
            <b-button class="mr-1 btn-brand" variant="google-plus text"><span>Google+</span></b-button>
            <b-button class="mr-1 btn-brand" variant="instagram text"><span>Instagram</span></b-button>
            <b-button class="mr-1 btn-brand" variant="pinterest text"><span>Pinterest</span></b-button>
            <b-button class="mr-1 btn-brand" variant="vk text"><span>VK</span></b-button>
            <b-button class="mr-1 btn-brand" variant="yahoo text"><span>Yahoo</span></b-button>
            <b-button class="mr-1 btn-brand" variant="behance text"><span>Behance</span></b-button>
            <b-button class="mr-1 btn-brand" variant="dropbox text"><span>Dropbox</span></b-button>
            <b-button class="mr-1 btn-brand" variant="reddit text"><span>Reddit</span></b-button>
            <b-button class="mr-1 btn-brand" variant="spotify text"><span>Spotify</span></b-button>
            <b-button class="mr-1 btn-brand" variant="vine text"><span>Vine</span></b-button>
            <b-button class="mr-1 btn-brand" variant="foursquare text"><span>Forsquare</span></b-button>
            <b-button class="mr-1 btn-brand" variant="vimeo text"><span>Vimeo</span></b-button>
          </p>
          <h6>Size Large
            <small>Add <code>size="lg"</code></small>
          </h6>
          <p>
            <b-button class="mr-1 btn-brand" size="lg" variant="facebook text"><span>Facebook</span></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="twitter text"><span>Twitter</span></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="linkedin text"><span>LinkedIn</span></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="flickr text"><span>Flickr</span></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="tumblr text"><span>Tumblr</span></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="xing text"><span>Xing</span></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="github text"><span>Github</span></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="html5 text"><span>HTML5</span></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="openid text"><span>OpenID</span></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="stack-overflow text"><span>StackOverflow</span>
            </b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="css3 text"><span>CSS3</span></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="youtube text"><span>YouTube</span></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="dribbble text"><span>Dribbble</span></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="google-plus text"><span>Google+</span></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="instagram text"><span>Instagram</span></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="pinterest text"><span>Pinterest</span></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="vk text"><span>VK</span></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="yahoo text"><span>Yahoo</span></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="behance text"><span>Behance</span></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="dropbox text"><span>Dropbox</span></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="reddit text"><span>Reddit</span></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="spotify text"><span>Spotify</span></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="vine text"><span>Vine</span></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="foursquare text"><span>Forsquare</span></b-button>
            <b-button class="mr-1 btn-brand" size="lg" variant="vimeo text"><span>Vimeo</span></b-button>
          </p>
        </b-card>
      </b-col><!--/.col-->
    </b-row><!--/.row-->
  </div>
</template>

<script>
  export default {
    name: 'brand-buttons'
  }
</script>

<style scoped lang="css">
  .btn {
    margin-bottom: 4px;
  }
</style>
