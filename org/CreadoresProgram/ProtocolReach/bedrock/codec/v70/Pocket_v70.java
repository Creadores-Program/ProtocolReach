package org.CreadoresProgram.ProtocolReach.bedrock.codec.v70;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.cloudburstmc.protocol.bedrock.codec.BedrockCodec;
import org.cloudburstmc.protocol.bedrock.codec.EntityDataTypeMap;
import org.cloudburstmc.protocol.bedrock.codec.v291.serializer.*;
import org.cloudburstmc.protocol.bedrock.data.*;
import org.cloudburstmc.protocol.bedrock.data.command.CommandParam;
import org.cloudburstmc.protocol.bedrock.data.entity.EntityDataFormat;
import org.cloudburstmc.protocol.bedrock.data.entity.EntityDataTypes;
import org.cloudburstmc.protocol.bedrock.data.entity.EntityEventType;
import org.cloudburstmc.protocol.bedrock.data.entity.EntityFlag;
import org.cloudburstmc.protocol.bedrock.packet.*;
import org.cloudburstmc.protocol.bedrock.transformer.BlockDefinitionTransformer;
import org.cloudburstmc.protocol.bedrock.transformer.BooleanTransformer;
import org.cloudburstmc.protocol.bedrock.transformer.StringTransformer;
import org.cloudburstmc.protocol.bedrock.transformer.FlagTransformer;
import org.cloudburstmc.protocol.bedrock.transformer.TypeMapTransformer;
import org.cloudburstmc.protocol.common.util.TypeMap;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Pocket_v70{
  protected static final TypeMap<EntityFlag> ENTITY_FLAGS = TypeMap.builder(EntityFlag.class)

  protected static final TypeMap<ParticleType> PARTICLE_TYPES = TypeMap.builder(ParticleType.class)

  protected static final EntityDataTypeMap ENTITY_DATA = EntityDataTypeMap.builder()

  protected static final TypeMap<Class<?>> GAME_RULE_TYPES = TypeMap.<Class<?>>builder("GameRuleType")

  
}
