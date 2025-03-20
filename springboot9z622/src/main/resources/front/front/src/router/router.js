import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Storeup from '../pages/storeup/list'
import AddrList from '../pages/shop-address/list'
import AddrAdd from '../pages/shop-address/addOrUpdate'
import Order from '../pages/shop-order/list'
import OrderConfirm from '../pages/shop-order/confirm'
import Cart from '../pages/shop-cart/list'
import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import yinlehuiList from '../pages/yinlehui/list'
import yinlehuiDetail from '../pages/yinlehui/detail'
import yinlehuiAdd from '../pages/yinlehui/add'
import yinletingList from '../pages/yinleting/list'
import yinletingDetail from '../pages/yinleting/detail'
import yinletingAdd from '../pages/yinleting/add'
import jiemuxinxiList from '../pages/jiemuxinxi/list'
import jiemuxinxiDetail from '../pages/jiemuxinxi/detail'
import jiemuxinxiAdd from '../pages/jiemuxinxi/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'storeup',
					component: Storeup
				},
                {
                    path: 'shop-address/list',
                    component: AddrList
                },
                {
                    path: 'shop-address/addOrUpdate',
                    component: AddrAdd
                },
				{
					path: 'shop-order/order',
					component: Order
				},
				{
					path: 'cart',
					component: Cart
				},
				{
					path: 'shop-order/orderConfirm',
					component: OrderConfirm
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'yinlehui',
					component: yinlehuiList
				},
				{
					path: 'yinlehuiDetail',
					component: yinlehuiDetail
				},
				{
					path: 'yinlehuiAdd',
					component: yinlehuiAdd
				},
				{
					path: 'yinleting',
					component: yinletingList
				},
				{
					path: 'yinletingDetail',
					component: yinletingDetail
				},
				{
					path: 'yinletingAdd',
					component: yinletingAdd
				},
				{
					path: 'jiemuxinxi',
					component: jiemuxinxiList
				},
				{
					path: 'jiemuxinxiDetail',
					component: jiemuxinxiDetail
				},
				{
					path: 'jiemuxinxiAdd',
					component: jiemuxinxiAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
