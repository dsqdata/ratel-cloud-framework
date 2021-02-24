package org.ratel.cloud.core.converter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.ratel.cloud.core.base.BaseEnum;

import java.io.IOException;

/**
 * 继承了BaseEnum接口的枚举值，将会统一按照以下格式序列化
 * {
 * "code": "XX",
 * "desc": "xxx"
 * }
 *
 * @author Ratel-Cloud
 * @version 1.0
 * @date 2021/02/24
 */
public class EnumSerializer extends StdSerializer<BaseEnum> {
    public static final EnumSerializer INSTANCE = new EnumSerializer();
    public static final String ALL_ENUM_KEY_FIELD = "code";
    public static final String ALL_ENUM_DESC_FIELD = "desc";

    public EnumSerializer() {
        super(BaseEnum.class);
    }

    @Override
    public void serialize(BaseEnum distance, JsonGenerator generator, SerializerProvider provider)
            throws IOException {
        generator.writeStartObject();
        generator.writeFieldName(ALL_ENUM_KEY_FIELD);
        generator.writeString(distance.getCode());
        generator.writeFieldName(ALL_ENUM_DESC_FIELD);
        generator.writeString(distance.getDesc());
        generator.writeEndObject();
    }
}
