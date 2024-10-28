const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmbgp63/",
            name: "ssmbgp63",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmbgp63/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "神马物流"
        } 
    }
}
export default base
