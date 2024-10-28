import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import dingdanguanli from '@/views/modules/dingdanguanli/list'
    import wuliuzhuizong from '@/views/modules/wuliuzhuizong/list'
    import cheliangjiaotongguanli from '@/views/modules/cheliangjiaotongguanli/list'
    import cheliangjiaotongleixing from '@/views/modules/cheliangjiaotongleixing/list'
    import yonghu from '@/views/modules/yonghu/list'
    import huowuxinxi from '@/views/modules/huowuxinxi/list'
    import chat from '@/views/modules/chat/list'
    import wuliuluxianfenpei from '@/views/modules/wuliuluxianfenpei/list'
    import huowufenlei from '@/views/modules/huowufenlei/list'
    import peisongyuan from '@/views/modules/peisongyuan/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '物流咨询',
        component: news
      }
      ,{
	path: '/dingdanguanli',
        name: '订单管理',
        component: dingdanguanli
      }
      ,{
	path: '/wuliuzhuizong',
        name: '物流追踪',
        component: wuliuzhuizong
      }
      ,{
	path: '/cheliangjiaotongguanli',
        name: '车辆交通管理',
        component: cheliangjiaotongguanli
      }
      ,{
	path: '/cheliangjiaotongleixing',
        name: '车辆交通类型',
        component: cheliangjiaotongleixing
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/huowuxinxi',
        name: '货物信息',
        component: huowuxinxi
      }
      ,{
	path: '/chat',
        name: '在线客服',
        component: chat
      }
      ,{
	path: '/wuliuluxianfenpei',
        name: '物流路线分配',
        component: wuliuluxianfenpei
      }
      ,{
	path: '/huowufenlei',
        name: '货物分类',
        component: huowufenlei
      }
      ,{
	path: '/peisongyuan',
        name: '配送员',
        component: peisongyuan
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
