package top.chen.forum.common.resp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ChenQi
 * @date 2023/10/26
 * @description: 统一返回结果
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Result<T> {
    private int code = 200;
    private String msg = "成功";
    private T data;
}
