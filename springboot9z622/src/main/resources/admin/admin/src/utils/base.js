const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot9z622/",
            name: "springboot9z622",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot9z622/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于Spring Boot的阳光音乐厅订票系统"
        } 
    }
}
export default base
