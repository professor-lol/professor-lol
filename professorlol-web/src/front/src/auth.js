import router from './router'

router.beforeEach(async (to, from, next) => {
  try {
    if (to.path === '/pages/login') {
      next();
    }
    // const response = await axios.get("/api/v1/resources/user");
    next()
  } catch (error) {
    console.log("error");
    next('/pages/login')
  }
});
