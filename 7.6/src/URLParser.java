import java.util.HashMap;
import java.util.Map;

public class URLParser {
    public static void main(String[] args) {
        String[] urls={"https://home.firefoxchina.cn/",
                "https://www.baidu.com/index.php?tn=monline_3_dg"};

        for (String url:urls) {
            parseUrl(url);
            System.out.println("==========");
        }
    }

    private static Map<String,Integer> schemaDefaultPortMap=new HashMap<>();
    static {
        schemaDefaultPortMap.put("http",80);
        schemaDefaultPortMap.put("https",443);
    }

    private static void parseUrl(String url) {
        //1,在url中定位写一部分————通过第一个://
        int pos;
        pos=url.indexOf("://");
        String schema=url.substring(0,pos);
        System.out.println("协议部分："+schema);

        String remain=url.substring(pos+3);

        pos=remain.indexOf("/");
        String service=remain.substring(0,pos);
        System.out.println("服务端"+service);

        //通过service，找到host和port部分
        int i=service.indexOf(":");
        String host=null;
        int port=-1;
        if(i==-1) {
            //没有明确port，则port信息使用协议的默认信息
            //service本身就是一个host
            host=service;
            port=schemaDefaultPortMap.get(schema);
        }else {
            //代表service由host和port组成
            host=service.substring(0,i);
            port=Integer.parseInt(service.substring(i+1));
        }
        System.out.println("服务器主机信息"+host);
        System.out.println("服务器主机信息"+port);

        remain=remain.substring(pos);
        pos=remain.indexOf("?");
        if(pos==-1) {
            System.out.println("路径部分"+remain);
        } else {
            String path=remain.substring(0,pos);
            String queryString=remain.substring(pos+1);
            System.out.println("路径部分"+path);
            System.out.println("查询字符部分"+queryString);
        }
    }
}
