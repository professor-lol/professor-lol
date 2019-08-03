import router from './router'
import axios from 'axios';

router.beforeEach(async (to, from, next) => {
    try {
        if(to.path === '/login'){
            next();
        }

        const response = await axios.get("/api/v1/resources/user");
        next()
    } catch (error) {
        next('/login')
    }
});
