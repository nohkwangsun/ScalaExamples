package org.pieuler.typesafeconfig.intro

import com.typesafe.config.ConfigFactory

object SimpleExamples {
  def main(args: Array[String]) {
    val config = ConfigFactory.load()

    println("          user's id is " + config.getString("user.id"))
    println("        user's name is " + config.getString("user.name"))
    println("user's phone number is " + config.getString("user.phone"))
  }
}