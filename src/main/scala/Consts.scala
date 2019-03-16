package icenet

import chisel3._

object IceNetConsts {
  val NET_IF_WIDTH = 64
  val NET_IF_BYTES = NET_IF_WIDTH/8
  val NET_LEN_BITS = 16

  val ETH_STANDARD_MTU = 1520
  val ETH_JUMBO_MTU = 9000
  val ETH_HEAD_BYTES = 16
  val ETH_MAC_BITS = 48
  val ETH_TYPE_BITS = 16
  val ETH_PAD_BITS = 16

  val IPV4_HEAD_BYTES = 20
  val UDP_HEAD_BYTES = 8

  val RLIMIT_MAX_INC = 256
  val RLIMIT_MAX_PERIOD = 256
  val RLIMIT_MAX_SIZE = 256

  def NET_FULL_KEEP = ~0.U(NET_IF_BYTES.W)
  def ETH_BCAST_MAC = ~0.U(ETH_MAC_BITS.W)
}
