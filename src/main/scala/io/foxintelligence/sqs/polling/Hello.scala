package io.foxintelligence.sqs.polling

import jakarta.mail._
import java.{util => ju}

object Hello extends App {
  val props = new ju.Properties()
  props.put("mail.debug", "true")
  props.put("mail.store.protocol", "imaps")

  val imap = Session.getInstance(props).getStore()
  imap.connect(
    "imap.gmail.com",
    993,
    "developer.fox3@gmail.com",
    "yotgxkzdeeigcuyp"
  )
  val folder = imap.getFolder("INBOX")

  folder.open(Folder.READ_ONLY)

  val message = folder.getMessage(1)

  println(message.getSubject())
}
