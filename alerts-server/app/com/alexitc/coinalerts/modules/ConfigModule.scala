package com.alexitc.coinalerts.modules

import com.alexitc.coinalerts.config.{JWTConfig, MailgunConfig, PlayJWTConfig, PlayMailgunConfig}
import com.google.inject.AbstractModule

class ConfigModule extends AbstractModule {

  override def configure(): Unit = {
    bind(classOf[JWTConfig]).to(classOf[PlayJWTConfig])
    bind(classOf[MailgunConfig]).to(classOf[PlayMailgunConfig])
  }
}
