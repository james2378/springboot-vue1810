<template>
<div class="home-preview" :style='{"width":"100%","margin":"0px auto","flexWrap":"wrap","justifyContent":"center","display":"flex"}'>



<div class="recommend" :style='{"padding":"20px 7% 0","margin":"0","textAlign":"center","background":"none","display":"block","width":"100%","position":"relative","order":"2"}'>
	
    <div class="title" :style='{"margin":"20px auto 40px","borderColor":"#7e6b5a","outline":"1px solid #7e6b5a","alignItems":"flex-start","outlineOffset":"2px","background":"#f6f5f3","borderWidth":"1px 0","display":"flex","width":"auto","position":"relative","borderStyle":"dashed","height":"56px"}'>
		<span :style='{"padding":"0 20px 0 100px","fontSize":"18px","lineHeight":"54px","color":"#4e4e4e","background":"url(http://codegen.caihongy.cn/20230207/cb0df322e9b14cb3b11556207d9fab2b.png) no-repeat 20px -1px,#f6f5f3","fontWeight":"600"}'>音乐会推荐</span>
	</div>
	
	<div v-if="true" class="idea recommendIdea" :style='{"padding":"0","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230208/7ff655a2b70d4061a845fc8af0bee79d.jpg) no-repeat left center / 100% 100%","display":"flex","width":"100%","justifyContent":"space-between","height":"240px"}'>
		<div class="box1" :style='{"width":"0","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"0","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"0","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"0","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
	
	
	
	<!-- 样式四 -->
	<div class="list list4 index-pv1" :style='{"minHeight":"760px","width":"100%","padding":"40px 0 0","background":"none","display":"block","height":"auto"}'>
		<div v-if="yinlehuiRecommend.length>0" class="list-item animation-box" @click="toDetail('yinlehuiDetail', yinlehuiRecommend[0])" :style='{"cursor":"pointer","width":"20%","margin":"0","position":"relative","float":"right","height":"480px"}'>
			<img :style='{"width":"100%","padding":"50px 30px","objectFit":"cover","float":"left","background":"url(http://codegen.caihongy.cn/20230207/346e413dce8f4515a5a57219df032ccd.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20230207/e75d04594fa6401b9993f023e829f7b8.png) no-repeat right bottom / auto 100%","height":"100%"}' v-if="preHttp(yinlehuiRecommend[0].fengmian)" :src="yinlehuiRecommend[0].fengmian.split(',')[0]" alt="" />
			<img :style='{"width":"100%","padding":"50px 30px","objectFit":"cover","float":"left","background":"url(http://codegen.caihongy.cn/20230207/346e413dce8f4515a5a57219df032ccd.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20230207/e75d04594fa6401b9993f023e829f7b8.png) no-repeat right bottom / auto 100%","height":"100%"}' v-else :src="baseUrl + (yinlehuiRecommend[0].fengmian?yinlehuiRecommend[0].fengmian.split(',')[0]:'')" alt="" />
			<div class="title line1" :style='{"margin":"0 auto","whiteSpace":"nowrap","overflow":"hidden","color":"#fff","textAlign":"center","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(207,193,176,1) 20%, rgba(166,147,124,1) 50%, rgba(207,193,176,1) 80%, rgba(255,255,255,1) 100%),#a6937c","width":"80%","lineHeight":"44px","fontSize":"14px","textOverflow":"ellipsis"}'>
                <div>{{yinlehuiRecommend[0].yinlehuimingcheng}}</div>
                <div>演出时间:{{yinlehuiRecommend[0].yanchushijian}}</div>
                <div>音乐厅:{{yinlehuiRecommend[0].yinleting}}</div>
            </div>
		</div>
		<div class="list-body" :style='{"width":"40%","margin":"0","float":"left","justifyContent":"space-between","display":"flex","height":"480px"}'>
			<div v-if="yinlehuiRecommend.length>1" @click="toDetail('yinlehuiDetail', yinlehuiRecommend[1])" class="list-item animation-box" :style='{"width":"50%","margin":"0","position":"relative","display":"inline-block","height":"100%"}'>
				<img :style='{"width":"100%","padding":"50px 30px","objectFit":"cover","float":"left","background":"url(http://codegen.caihongy.cn/20230207/346e413dce8f4515a5a57219df032ccd.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20230207/e75d04594fa6401b9993f023e829f7b8.png) no-repeat right bottom / auto 100%","height":"100%"}' v-if="preHttp(yinlehuiRecommend[1].fengmian)" :src="yinlehuiRecommend[1].fengmian.split(',')[0]" alt="" />
				<img :style='{"width":"100%","padding":"50px 30px","objectFit":"cover","float":"left","background":"url(http://codegen.caihongy.cn/20230207/346e413dce8f4515a5a57219df032ccd.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20230207/e75d04594fa6401b9993f023e829f7b8.png) no-repeat right bottom / auto 100%","height":"100%"}' v-else :src="baseUrl + (yinlehuiRecommend[1].fengmian?yinlehuiRecommend[1].fengmian.split(',')[0]:'')" alt="" />
				<div class="title line1" :style='{"margin":"0 auto","whiteSpace":"nowrap","overflow":"hidden","color":"#fff","textAlign":"center","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(207,193,176,1) 20%, rgba(166,147,124,1) 50%, rgba(207,193,176,1) 80%, rgba(255,255,255,1) 100%),#a6937c","width":"80%","lineHeight":"44px","fontSize":"14px","textOverflow":"ellipsis"}'>
                    <div>{{yinlehuiRecommend[1].yinlehuimingcheng}}</div>
                    <div>演出时间:{{yinlehuiRecommend[1].yanchushijian}}</div>
                    <div>音乐厅:{{yinlehuiRecommend[1].yinleting}}</div>
                </div>
			</div>
			<div v-if="yinlehuiRecommend.length>2" @click="toDetail('yinlehuiDetail', yinlehuiRecommend[2])" class="list-item animation-box" :style='{"width":"50%","margin":"80px 0 0","position":"relative","flexWrap":"wrap","display":"flex","height":"100%"}'>
				<img :style='{"padding":"50px 30px","objectFit":"cover","background":"url(http://codegen.caihongy.cn/20230207/346e413dce8f4515a5a57219df032ccd.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20230207/e75d04594fa6401b9993f023e829f7b8.png) no-repeat right bottom / auto 100%","width":"100%","float":"left","height":"100%","order":"2"}' v-if="preHttp(yinlehuiRecommend[2].fengmian)" :src="yinlehuiRecommend[2].fengmian.split(',')[0]" alt="" />
				<img :style='{"padding":"50px 30px","objectFit":"cover","background":"url(http://codegen.caihongy.cn/20230207/346e413dce8f4515a5a57219df032ccd.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20230207/e75d04594fa6401b9993f023e829f7b8.png) no-repeat right bottom / auto 100%","width":"100%","float":"left","height":"100%","order":"2"}' v-else :src="baseUrl + (yinlehuiRecommend[2].fengmian?yinlehuiRecommend[2].fengmian.split(',')[0]:'')" alt="" />
				<div class="title line1" :style='{"margin":"0 auto","whiteSpace":"nowrap","overflow":"hidden","color":"#fff","textAlign":"center","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(207,193,176,1) 20%, rgba(166,147,124,1) 50%, rgba(207,193,176,1) 80%, rgba(255,255,255,1) 100%),#a6937c","width":"80%","lineHeight":"44px","fontSize":"14px","textOverflow":"ellipsis"}'>
                    <div>{{yinlehuiRecommend[2].yinlehuimingcheng}}</div>
                    <div>演出时间:{{yinlehuiRecommend[2].yanchushijian}}</div>
                    <div>音乐厅:{{yinlehuiRecommend[2].yinleting}}</div>
                </div>
			</div>
		</div>
		<div class="list-body" :style='{"width":"40%","margin":"0","float":"left","justifyContent":"space-between","display":"flex","height":"480px"}'>
			<div v-if="yinlehuiRecommend.length>3" @click="toDetail('yinlehuiDetail', yinlehuiRecommend[3])" class="list-item animation-box" :style='{"width":"50%","margin":"0","position":"relative","display":"inline-block","height":"100%"}'>
				<img :style='{"width":"100%","padding":"50px 30px","objectFit":"cover","float":"left","background":"url(http://codegen.caihongy.cn/20230207/346e413dce8f4515a5a57219df032ccd.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20230207/e75d04594fa6401b9993f023e829f7b8.png) no-repeat right bottom / auto 100%","height":"100%"}' v-if="preHttp(yinlehuiRecommend[3].fengmian)" :src="yinlehuiRecommend[3].fengmian.split(',')[0]" alt="" />
				<img :style='{"width":"100%","padding":"50px 30px","objectFit":"cover","float":"left","background":"url(http://codegen.caihongy.cn/20230207/346e413dce8f4515a5a57219df032ccd.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20230207/e75d04594fa6401b9993f023e829f7b8.png) no-repeat right bottom / auto 100%","height":"100%"}' v-else :src="baseUrl + (yinlehuiRecommend[3].fengmian?yinlehuiRecommend[3].fengmian.split(',')[0]:'')" alt="" />
				<div class="title line1" :style='{"margin":"0 auto","whiteSpace":"nowrap","overflow":"hidden","color":"#fff","textAlign":"center","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(207,193,176,1) 20%, rgba(166,147,124,1) 50%, rgba(207,193,176,1) 80%, rgba(255,255,255,1) 100%),#a6937c","width":"80%","lineHeight":"44px","fontSize":"14px","textOverflow":"ellipsis"}'>
                    <div>{{yinlehuiRecommend[3].yinlehuimingcheng}}</div>
                    <div>演出时间:{{yinlehuiRecommend[3].yanchushijian}}</div>
                    <div>音乐厅:{{yinlehuiRecommend[3].yinleting}}</div>
                </div>
			</div>
			<div v-if="yinlehuiRecommend.length>4" @click="toDetail('yinlehuiDetail', yinlehuiRecommend[4])" class="list-item animation-box" :style='{"width":"50%","margin":"80px 0 0","position":"relative","flexWrap":"wrap","display":"flex","height":"100%"}'>
				<img :style='{"padding":"50px 30px","objectFit":"cover","background":"url(http://codegen.caihongy.cn/20230207/346e413dce8f4515a5a57219df032ccd.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20230207/e75d04594fa6401b9993f023e829f7b8.png) no-repeat right bottom / auto 100%","width":"100%","float":"left","height":"100%","order":"2"}' v-if="preHttp(yinlehuiRecommend[4].fengmian)" :src="yinlehuiRecommend[4].fengmian.split(',')[0]" alt="" />
				<img :style='{"padding":"50px 30px","objectFit":"cover","background":"url(http://codegen.caihongy.cn/20230207/346e413dce8f4515a5a57219df032ccd.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20230207/e75d04594fa6401b9993f023e829f7b8.png) no-repeat right bottom / auto 100%","width":"100%","float":"left","height":"100%","order":"2"}' v-else :src="baseUrl + (yinlehuiRecommend[4].fengmian?yinlehuiRecommend[4].fengmian.split(',')[0]:'')" alt="" />
				<div class="title line1" :style='{"margin":"0 auto","whiteSpace":"nowrap","overflow":"hidden","color":"#fff","textAlign":"center","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(207,193,176,1) 20%, rgba(166,147,124,1) 50%, rgba(207,193,176,1) 80%, rgba(255,255,255,1) 100%),#a6937c","width":"80%","lineHeight":"44px","fontSize":"14px","textOverflow":"ellipsis"}'>
                    <div>{{yinlehuiRecommend[4].yinlehuimingcheng}}</div>
                    <div>演出时间:{{yinlehuiRecommend[4].yanchushijian}}</div>
                    <div>音乐厅:{{yinlehuiRecommend[4].yinleting}}</div>
                </div>
			</div>
		</div>
	</div>
	
	
	
	
	
	
	<div @click="moreBtn('yinlehui')" :style='{"border":"0","padding":"0 2px 0 10px","margin":"20px auto","textAlign":"center","display":"inline-block","minWidth":"120px","right":"calc(7% + 20px)","borderRadius":"8px","top":"28px","background":"none","width":"auto","lineHeight":"40px","position":"absolute","height":"44px","zIndex":"1010"}'>
		<span :style='{"color":"#333","fontSize":"15px"}'>查看更多</span>
		<i v-if="true" :style='{"color":"#333","fontSize":"15px"}' class="el-icon-d-arrow-right"></i>
	</div>
	
</div>

	


<div class="lists" :style='{"padding":"0 0 60px","margin":"60px 7% 0","textAlign":"center","background":"none","display":"block","width":"86%","position":"relative","order":"30"}'>
	<div v-if="false" class="idea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
	<div class="title" :style='{"margin":"0 0 40px","borderColor":"#7e6b5a","alignItems":"flex-start","textAlign":"center","display":"flex","outline":"1px solid #7e6b5a","outlineOffset":"2px","background":"#f6f5f3","borderWidth":"1px 0","width":"auto","position":"relative","borderStyle":"dashed","height":"56px"}'>
	  <span :style='{"padding":"0 20px 0 100px","fontSize":"18px","lineHeight":"54px","color":"#4e4e4e","background":"url(http://codegen.caihongy.cn/20230207/cb0df322e9b14cb3b11556207d9fab2b.png) no-repeat 20px -1px,#f6f5f3","fontWeight":"600"}'>节目信息展示</span>
	</div>
	
	
	
	
	
	
	
	
	
	<!-- 样式八 -->
	<div class="list list8 index-pv1" :style='{"padding":"0","flexWrap":"wrap","background":"#fff","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}'>
		<div :style='{"width":"48%","flexWrap":"wrap","justifyContent":"space-between","display":"flex","height":"570px","order":"2"}' class="list-body">
			<div v-if="jiemuxinxiList.length>0" @click="toDetail('jiemuxinxiDetail', jiemuxinxiList[0])" class="list-4-item animation-box item-1" :style='{"width":"48%","margin":"0","position":"relative","height":"auto","order":"2"}'>
				<img :style='{"padding":"40px","margin":"0 0 4px","objectFit":"cover","background":"url(http://codegen.caihongy.cn/20230207/346e413dce8f4515a5a57219df032ccd.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20230207/e75d04594fa6401b9993f023e829f7b8.png) no-repeat right bottom / auto 100%","width":"100%","float":"left","height":"400px"}' v-if="preHttp(jiemuxinxiList[0].fengmian)" :src="jiemuxinxiList[0].fengmian.split(',')[0]" alt="" />
				<img :style='{"padding":"40px","margin":"0 0 4px","objectFit":"cover","background":"url(http://codegen.caihongy.cn/20230207/346e413dce8f4515a5a57219df032ccd.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20230207/e75d04594fa6401b9993f023e829f7b8.png) no-repeat right bottom / auto 100%","width":"100%","float":"left","height":"400px"}' v-else :src="baseUrl + (jiemuxinxiList[0].fengmian?jiemuxinxiList[0].fengmian.split(',')[0]:'')" alt="" />
				<div class="list-4-item-title line1" :style='{"whiteSpace":"nowrap","overflow":"hidden","color":"#fff","textAlign":"center","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(207,193,176,1) 20%, rgba(166,147,124,1) 50%, rgba(207,193,176,1) 80%, rgba(255,255,255,1) 100%),#a6937c","width":"100%","lineHeight":"30px","fontSize":"14px","textOverflow":"ellipsis"}'>
                    <div>{{jiemuxinxiList[0].jiemumingcheng}}</div>
                    <div>表演时间:{{jiemuxinxiList[0].biaoyanshijian}}</div>
                    <div>歌手:{{jiemuxinxiList[0].geshou}}</div>
                </div>
			</div>
			<div v-if="jiemuxinxiList.length>1" @click="toDetail('jiemuxinxiDetail', jiemuxinxiList[1])" class="list-4-item animation-box item-2" :style='{"width":"48%","margin":"0","position":"relative","height":"auto","order":"3"}'>
				<img :style='{"padding":"40px","margin":"0 0 4px","objectFit":"cover","background":"url(http://codegen.caihongy.cn/20230207/346e413dce8f4515a5a57219df032ccd.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20230207/e75d04594fa6401b9993f023e829f7b8.png) no-repeat right bottom / auto 100%","width":"100%","float":"left","height":"400px"}' v-if="preHttp(jiemuxinxiList[1].fengmian)" :src="jiemuxinxiList[1].fengmian.split(',')[0]" alt="" />
				<img :style='{"padding":"40px","margin":"0 0 4px","objectFit":"cover","background":"url(http://codegen.caihongy.cn/20230207/346e413dce8f4515a5a57219df032ccd.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20230207/e75d04594fa6401b9993f023e829f7b8.png) no-repeat right bottom / auto 100%","width":"100%","float":"left","height":"400px"}' v-else :src="baseUrl + (jiemuxinxiList[1].fengmian?jiemuxinxiList[1].fengmian.split(',')[0]:'')" alt="" />
				<div class="list-4-item-title line1" :style='{"whiteSpace":"nowrap","overflow":"hidden","color":"#fff","textAlign":"center","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(207,193,176,1) 20%, rgba(166,147,124,1) 50%, rgba(207,193,176,1) 80%, rgba(255,255,255,1) 100%),#a6937c","width":"100%","lineHeight":"30px","fontSize":"14px","textOverflow":"ellipsis"}'>
                    <div>{{jiemuxinxiList[1].jiemumingcheng}}</div>
                    <div>表演时间:{{jiemuxinxiList[1].biaoyanshijian}}</div>
                    <div>歌手:{{jiemuxinxiList[1].geshou}}</div>
                </div>
			</div>
			<div v-if="jiemuxinxiList.length>2" @click="toDetail('jiemuxinxiDetail', jiemuxinxiList[2])" class="list-4-item animation-box item-3" :style='{"width":"100%","margin":"0 0 20px","position":"relative","height":"auto"}'>
				<img :style='{"padding":"40px","margin":"0 0 4px","objectFit":"cover","background":"url(http://codegen.caihongy.cn/20230207/346e413dce8f4515a5a57219df032ccd.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20230207/e75d04594fa6401b9993f023e829f7b8.png) no-repeat right bottom / auto 100%","width":"100%","float":"left","height":"400px"}' v-if="preHttp(jiemuxinxiList[2].fengmian)" :src="jiemuxinxiList[2].fengmian.split(',')[0]" alt="" />
				<img :style='{"padding":"40px","margin":"0 0 4px","objectFit":"cover","background":"url(http://codegen.caihongy.cn/20230207/346e413dce8f4515a5a57219df032ccd.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20230207/e75d04594fa6401b9993f023e829f7b8.png) no-repeat right bottom / auto 100%","width":"100%","float":"left","height":"400px"}' v-else :src="baseUrl + (jiemuxinxiList[2].fengmian?jiemuxinxiList[2].fengmian.split(',')[0]:'')" alt="" />
				<div class="list-4-item-title line1" :style='{"whiteSpace":"nowrap","overflow":"hidden","color":"#fff","textAlign":"center","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(207,193,176,1) 20%, rgba(166,147,124,1) 50%, rgba(207,193,176,1) 80%, rgba(255,255,255,1) 100%),#a6937c","width":"100%","lineHeight":"30px","fontSize":"14px","textOverflow":"ellipsis"}'>
                    <div>{{jiemuxinxiList[2].jiemumingcheng}}</div>
                    <div>表演时间:{{jiemuxinxiList[2].biaoyanshijian}}</div>
                    <div>歌手:{{jiemuxinxiList[2].geshou}}</div>
                </div>
			</div>
		</div>
		<div :style='{"width":"48%","margin":"0","flexWrap":"wrap","justifyContent":"space-between","display":"flex","height":"auto"}' class="list-body">
			<div v-if="jiemuxinxiList.length>3" @click="toDetail('jiemuxinxiDetail', jiemuxinxiList[3])" class="list-4-item animation-box item-4" :style='{"width":"100%","margin":"0 0 20px","position":"relative","height":"auto"}'>
				<img :style='{"padding":"40px","margin":"0 0 4px","objectFit":"cover","background":"url(http://codegen.caihongy.cn/20230207/346e413dce8f4515a5a57219df032ccd.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20230207/e75d04594fa6401b9993f023e829f7b8.png) no-repeat right bottom / auto 100%","width":"100%","float":"left","height":"400px"}' v-if="preHttp(jiemuxinxiList[3].fengmian)" :src="jiemuxinxiList[3].fengmian.split(',')[0]" alt="" />
				<img :style='{"padding":"40px","margin":"0 0 4px","objectFit":"cover","background":"url(http://codegen.caihongy.cn/20230207/346e413dce8f4515a5a57219df032ccd.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20230207/e75d04594fa6401b9993f023e829f7b8.png) no-repeat right bottom / auto 100%","width":"100%","float":"left","height":"400px"}' v-else :src="baseUrl + (jiemuxinxiList[3].fengmian?jiemuxinxiList[3].fengmian.split(',')[0]:'')" alt="" />
				<div class="list-4-item-title line1" :style='{"whiteSpace":"nowrap","overflow":"hidden","color":"#fff","textAlign":"center","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(207,193,176,1) 20%, rgba(166,147,124,1) 50%, rgba(207,193,176,1) 80%, rgba(255,255,255,1) 100%),#a6937c","width":"100%","lineHeight":"30px","fontSize":"14px","textOverflow":"ellipsis"}'>
                    <div>{{jiemuxinxiList[3].jiemumingcheng}}</div>
                    <div>表演时间:{{jiemuxinxiList[3].biaoyanshijian}}</div>
                    <div>歌手:{{jiemuxinxiList[3].geshou}}</div>
                </div>
			</div>
			<div v-if="jiemuxinxiList.length>4" @click="toDetail('jiemuxinxiDetail', jiemuxinxiList[4])" class="list-4-item animation-box item-5" :style='{"width":"100%","position":"relative","height":"auto"}'>
				<img :style='{"padding":"40px","margin":"0 0 4px","objectFit":"cover","background":"url(http://codegen.caihongy.cn/20230207/346e413dce8f4515a5a57219df032ccd.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20230207/e75d04594fa6401b9993f023e829f7b8.png) no-repeat right bottom / auto 100%","width":"100%","float":"left","height":"400px"}' v-if="preHttp(jiemuxinxiList[4].fengmian)" :src="jiemuxinxiList[4].fengmian.split(',')[0]" alt="" />
				<img :style='{"padding":"40px","margin":"0 0 4px","objectFit":"cover","background":"url(http://codegen.caihongy.cn/20230207/346e413dce8f4515a5a57219df032ccd.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20230207/e75d04594fa6401b9993f023e829f7b8.png) no-repeat right bottom / auto 100%","width":"100%","float":"left","height":"400px"}' v-else :src="baseUrl + (jiemuxinxiList[4].fengmian?jiemuxinxiList[4].fengmian.split(',')[0]:'')" alt="" />
				<div class="list-4-item-title line1" :style='{"whiteSpace":"nowrap","overflow":"hidden","color":"#fff","textAlign":"center","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(207,193,176,1) 20%, rgba(166,147,124,1) 50%, rgba(207,193,176,1) 80%, rgba(255,255,255,1) 100%),#a6937c","width":"100%","lineHeight":"30px","fontSize":"14px","textOverflow":"ellipsis"}'>
                    <div>{{jiemuxinxiList[4].jiemumingcheng}}</div>
                    <div>表演时间:{{jiemuxinxiList[4].biaoyanshijian}}</div>
                    <div>歌手:{{jiemuxinxiList[4].geshou}}</div>
                </div>
			</div>
		</div>
	</div>
	
	
	<div @click="moreBtn('jiemuxinxi')" :style='{"border":"0","padding":"0 20px","margin":"0 auto","textAlign":"center","display":"block","minWidth":"120px","right":"0","borderRadius":"8px","top":"8px","background":"none","width":"auto","lineHeight":"40px","position":"absolute","zIndex":"1010"}'>
		<span :style='{"color":"#333","fontSize":"15px"}'>查看更多</span>
		<i v-if="true" :style='{"color":"#333","fontSize":"15px"}' class="el-icon-d-arrow-right"></i>
	</div>
	

</div>


</div>
</template>

<script>
  export default {
    //数据集合
    data() {
      return {
        baseUrl: '',
        newsList: [],
        yinlehuiRecommend: [],

        jiemuxinxiList: [],
      }
    },
    created() {
      this.baseUrl = this.$config.baseUrl;
      this.getList();
    },
    //方法集合
    methods: {
      preHttp(str) {
          return str && str.substr(0,4)=='http';
      },
		getList() {
          let autoSortUrl = "";
          autoSortUrl = "yinlehui/autoSort";
			this.$http.get(autoSortUrl, {params: {
				page: 1,
				limit: 5,
			}}).then(res => {
				if (res.data.code == 0) {
					this.yinlehuiRecommend = res.data.data.list;
					
					
					// 商品列表样式五
					
				}
			});
			
			this.$http.get('jiemuxinxi/list', {params: {
				page: 1,
				limit: 5,
			}}).then(res => {
				if (res.data.code == 0) {
					this.jiemuxinxiList = res.data.data.list;
					
					// 商品列表样式五
					
				}
			});
		},
		toDetail(path, item) {
			this.$router.push({path: '/index/' + path, query: {detailObj: JSON.stringify(item)}});
		},
		moreBtn(path) {
			this.$router.push({path: '/index/' + path});
		}
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.home-preview {
	
		.recommend {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
        }
        
        .list5 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform:  translate3d(0px, -10px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: kew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
		
		.news {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list6 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list6 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform:  translate3d(10px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform:  skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	
		.lists {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
        }
        
        .list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-next {
            left: auto;
            right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform:  skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	}
</style>
