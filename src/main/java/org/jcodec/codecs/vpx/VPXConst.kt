package org.jcodec.codecs.vpx

/**
 * This class is part of JCodec ( www.jcodec.org ) This software is distributed
 * under FreeBSD License
 *
 * @author The JCodec project
 */
object VPXConst {
    val vp8Norm = intArrayOf(
            0, 7, 6, 6, 5, 5, 5, 5, 4, 4, 4, 4, 4, 4, 4, 4,
            3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
            2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
            2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
            1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
            1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
            1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
            1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
    )
    @JvmField
    val tokenDefaultBinProbs = arrayOf(arrayOf(arrayOf(intArrayOf(128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128), intArrayOf(128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128), intArrayOf(128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128)), arrayOf(intArrayOf(253, 136, 254, 255, 228, 219, 128, 128, 128, 128, 128), intArrayOf(189, 129, 242, 255, 227, 213, 255, 219, 128, 128, 128), intArrayOf(106, 126, 227, 252, 214, 209, 255, 255, 128, 128, 128)), arrayOf(intArrayOf(1, 98, 248, 255, 236, 226, 255, 255, 128, 128, 128), intArrayOf(181, 133, 238, 254, 221, 234, 255, 154, 128, 128, 128), intArrayOf(78, 134, 202, 247, 198, 180, 255, 219, 128, 128, 128)), arrayOf(intArrayOf(1, 185, 249, 255, 243, 255, 128, 128, 128, 128, 128), intArrayOf(184, 150, 247, 255, 236, 224, 128, 128, 128, 128, 128), intArrayOf(77, 110, 216, 255, 236, 230, 128, 128, 128, 128, 128)), arrayOf(intArrayOf(1, 101, 251, 255, 241, 255, 128, 128, 128, 128, 128), intArrayOf(170, 139, 241, 252, 236, 209, 255, 255, 128, 128, 128), intArrayOf(37, 116, 196, 243, 228, 255, 255, 255, 128, 128, 128)), arrayOf(intArrayOf(1, 204, 254, 255, 245, 255, 128, 128, 128, 128, 128), intArrayOf(207, 160, 250, 255, 238, 128, 128, 128, 128, 128, 128), intArrayOf(102, 103, 231, 255, 211, 171, 128, 128, 128, 128, 128)), arrayOf(intArrayOf(1, 152, 252, 255, 240, 255, 128, 128, 128, 128, 128), intArrayOf(177, 135, 243, 255, 234, 225, 128, 128, 128, 128, 128), intArrayOf(80, 129, 211, 255, 194, 224, 128, 128, 128, 128, 128)), arrayOf(intArrayOf(1, 1, 255, 128, 128, 128, 128, 128, 128, 128, 128), intArrayOf(246, 1, 255, 128, 128, 128, 128, 128, 128, 128, 128), intArrayOf(255, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128))), arrayOf(arrayOf(intArrayOf(198, 35, 237, 223, 193, 187, 162, 160, 145, 155, 62), intArrayOf(131, 45, 198, 221, 172, 176, 220, 157, 252, 221, 1), intArrayOf(68, 47, 146, 208, 149, 167, 221, 162, 255, 223, 128)), arrayOf(intArrayOf(1, 149, 241, 255, 221, 224, 255, 255, 128, 128, 128), intArrayOf(184, 141, 234, 253, 222, 220, 255, 199, 128, 128, 128), intArrayOf(81, 99, 181, 242, 176, 190, 249, 202, 255, 255, 128)), arrayOf(intArrayOf(1, 129, 232, 253, 214, 197, 242, 196, 255, 255, 128), intArrayOf(99, 121, 210, 250, 201, 198, 255, 202, 128, 128, 128), intArrayOf(23, 91, 163, 242, 170, 187, 247, 210, 255, 255, 128)), arrayOf(intArrayOf(1, 200, 246, 255, 234, 255, 128, 128, 128, 128, 128), intArrayOf(109, 178, 241, 255, 231, 245, 255, 255, 128, 128, 128), intArrayOf(44, 130, 201, 253, 205, 192, 255, 255, 128, 128, 128)), arrayOf(intArrayOf(1, 132, 239, 251, 219, 209, 255, 165, 128, 128, 128), intArrayOf(94, 136, 225, 251, 218, 190, 255, 255, 128, 128, 128), intArrayOf(22, 100, 174, 245, 186, 161, 255, 199, 128, 128, 128)), arrayOf(intArrayOf(1, 182, 249, 255, 232, 235, 128, 128, 128, 128, 128), intArrayOf(124, 143, 241, 255, 227, 234, 128, 128, 128, 128, 128), intArrayOf(35, 77, 181, 251, 193, 211, 255, 205, 128, 128, 128)), arrayOf(intArrayOf(1, 157, 247, 255, 236, 231, 255, 255, 128, 128, 128), intArrayOf(121, 141, 235, 255, 225, 227, 255, 255, 128, 128, 128), intArrayOf(45, 99, 188, 251, 195, 217, 255, 224, 128, 128, 128)), arrayOf(intArrayOf(1, 1, 251, 255, 213, 255, 128, 128, 128, 128, 128), intArrayOf(203, 1, 248, 255, 255, 128, 128, 128, 128, 128, 128), intArrayOf(137, 1, 177, 255, 224, 255, 128, 128, 128, 128, 128))), arrayOf(arrayOf(intArrayOf(253, 9, 248, 251, 207, 208, 255, 192, 128, 128, 128), intArrayOf(175, 13, 224, 243, 193, 185, 249, 198, 255, 255, 128), intArrayOf(73, 17, 171, 221, 161, 179, 236, 167, 255, 234, 128)), arrayOf(intArrayOf(1, 95, 247, 253, 212, 183, 255, 255, 128, 128, 128), intArrayOf(239, 90, 244, 250, 211, 209, 255, 255, 128, 128, 128), intArrayOf(155, 77, 195, 248, 188, 195, 255, 255, 128, 128, 128)), arrayOf(intArrayOf(1, 24, 239, 251, 218, 219, 255, 205, 128, 128, 128), intArrayOf(201, 51, 219, 255, 196, 186, 128, 128, 128, 128, 128), intArrayOf(69, 46, 190, 239, 201, 218, 255, 228, 128, 128, 128)), arrayOf(intArrayOf(1, 191, 251, 255, 255, 128, 128, 128, 128, 128, 128), intArrayOf(223, 165, 249, 255, 213, 255, 128, 128, 128, 128, 128), intArrayOf(141, 124, 248, 255, 255, 128, 128, 128, 128, 128, 128)), arrayOf(intArrayOf(1, 16, 248, 255, 255, 128, 128, 128, 128, 128, 128), intArrayOf(190, 36, 230, 255, 236, 255, 128, 128, 128, 128, 128), intArrayOf(149, 1, 255, 128, 128, 128, 128, 128, 128, 128, 128)), arrayOf(intArrayOf(1, 226, 255, 128, 128, 128, 128, 128, 128, 128, 128), intArrayOf(247, 192, 255, 128, 128, 128, 128, 128, 128, 128, 128), intArrayOf(240, 128, 255, 128, 128, 128, 128, 128, 128, 128, 128)), arrayOf(intArrayOf(1, 134, 252, 255, 255, 128, 128, 128, 128, 128, 128), intArrayOf(213, 62, 250, 255, 255, 128, 128, 128, 128, 128, 128), intArrayOf(55, 93, 255, 128, 128, 128, 128, 128, 128, 128, 128)), arrayOf(intArrayOf(128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128), intArrayOf(128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128), intArrayOf(128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128))), arrayOf(arrayOf(intArrayOf(202, 24, 213, 235, 186, 191, 220, 160, 240, 175, 255), intArrayOf(126, 38, 182, 232, 169, 184, 228, 174, 255, 187, 128), intArrayOf(61, 46, 138, 219, 151, 178, 240, 170, 255, 216, 128)), arrayOf(intArrayOf(1, 112, 230, 250, 199, 191, 247, 159, 255, 255, 128), intArrayOf(166, 109, 228, 252, 211, 215, 255, 174, 128, 128, 128), intArrayOf(39, 77, 162, 232, 172, 180, 245, 178, 255, 255, 128)), arrayOf(intArrayOf(1, 52, 220, 246, 198, 199, 249, 220, 255, 255, 128), intArrayOf(124, 74, 191, 243, 183, 193, 250, 221, 255, 255, 128), intArrayOf(24, 71, 130, 219, 154, 170, 243, 182, 255, 255, 128)), arrayOf(intArrayOf(1, 182, 225, 249, 219, 240, 255, 224, 128, 128, 128), intArrayOf(149, 150, 226, 252, 216, 205, 255, 171, 128, 128, 128), intArrayOf(28, 108, 170, 242, 183, 194, 254, 223, 255, 255, 128)), arrayOf(intArrayOf(1, 81, 230, 252, 204, 203, 255, 192, 128, 128, 128), intArrayOf(123, 102, 209, 247, 188, 196, 255, 233, 128, 128, 128), intArrayOf(20, 95, 153, 243, 164, 173, 255, 203, 128, 128, 128)), arrayOf(intArrayOf(1, 222, 248, 255, 216, 213, 128, 128, 128, 128, 128), intArrayOf(168, 175, 246, 252, 235, 205, 255, 255, 128, 128, 128), intArrayOf(47, 116, 215, 255, 211, 212, 255, 255, 128, 128, 128)), arrayOf(intArrayOf(1, 121, 236, 253, 212, 214, 255, 255, 128, 128, 128), intArrayOf(141, 84, 213, 252, 201, 202, 255, 219, 128, 128, 128), intArrayOf(42, 80, 160, 240, 162, 185, 255, 205, 128, 128, 128)), arrayOf(intArrayOf(1, 1, 255, 128, 128, 128, 128, 128, 128, 128, 128), intArrayOf(244, 1, 255, 128, 128, 128, 128, 128, 128, 128, 128), intArrayOf(238, 1, 255, 128, 128, 128, 128, 128, 128, 128, 128))))
    @JvmField
    val tokenProbUpdateFlagProbs = arrayOf(arrayOf(arrayOf(intArrayOf(255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255)), arrayOf(intArrayOf(176, 246, 255, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(223, 241, 252, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(249, 253, 253, 255, 255, 255, 255, 255, 255, 255, 255)), arrayOf(intArrayOf(255, 244, 252, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(234, 254, 254, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(253, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255)), arrayOf(intArrayOf(255, 246, 254, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(239, 253, 254, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(254, 255, 254, 255, 255, 255, 255, 255, 255, 255, 255)), arrayOf(intArrayOf(255, 248, 254, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(251, 255, 254, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255)), arrayOf(intArrayOf(255, 253, 254, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(251, 254, 254, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(254, 255, 254, 255, 255, 255, 255, 255, 255, 255, 255)), arrayOf(intArrayOf(255, 254, 253, 255, 254, 255, 255, 255, 255, 255, 255), intArrayOf(250, 255, 254, 255, 254, 255, 255, 255, 255, 255, 255), intArrayOf(254, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255)), arrayOf(intArrayOf(255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255))), arrayOf(arrayOf(intArrayOf(217, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(225, 252, 241, 253, 255, 255, 254, 255, 255, 255, 255), intArrayOf(234, 250, 241, 250, 253, 255, 253, 254, 255, 255, 255)), arrayOf(intArrayOf(255, 254, 255, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(223, 254, 254, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(238, 253, 254, 254, 255, 255, 255, 255, 255, 255, 255)), arrayOf(intArrayOf(255, 248, 254, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(249, 254, 255, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255)), arrayOf(intArrayOf(255, 253, 255, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(247, 254, 255, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255)), arrayOf(intArrayOf(255, 253, 254, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(252, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255)), arrayOf(intArrayOf(255, 254, 254, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(253, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255)), arrayOf(intArrayOf(255, 254, 253, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(250, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(254, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255)), arrayOf(intArrayOf(255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255))), arrayOf(arrayOf(intArrayOf(186, 251, 250, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(234, 251, 244, 254, 255, 255, 255, 255, 255, 255, 255), intArrayOf(251, 251, 243, 253, 254, 255, 254, 255, 255, 255, 255)), arrayOf(intArrayOf(255, 253, 254, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(236, 253, 254, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(251, 253, 253, 254, 254, 255, 255, 255, 255, 255, 255)), arrayOf(intArrayOf(255, 254, 254, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(254, 254, 254, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255)), arrayOf(intArrayOf(255, 254, 255, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(254, 254, 255, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(254, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255)), arrayOf(intArrayOf(255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(254, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255)), arrayOf(intArrayOf(255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255)), arrayOf(intArrayOf(255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255)), arrayOf(intArrayOf(255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255))), arrayOf(arrayOf(intArrayOf(248, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(250, 254, 252, 254, 255, 255, 255, 255, 255, 255, 255), intArrayOf(248, 254, 249, 253, 255, 255, 255, 255, 255, 255, 255)), arrayOf(intArrayOf(255, 253, 253, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(246, 253, 253, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(252, 254, 251, 254, 254, 255, 255, 255, 255, 255, 255)), arrayOf(intArrayOf(255, 254, 252, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(248, 254, 253, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(253, 255, 254, 254, 255, 255, 255, 255, 255, 255, 255)), arrayOf(intArrayOf(255, 251, 254, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(245, 251, 254, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(253, 253, 254, 255, 255, 255, 255, 255, 255, 255, 255)), arrayOf(intArrayOf(255, 251, 253, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(252, 253, 254, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(255, 254, 255, 255, 255, 255, 255, 255, 255, 255, 255)), arrayOf(intArrayOf(255, 252, 255, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(249, 255, 254, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(255, 255, 254, 255, 255, 255, 255, 255, 255, 255, 255)), arrayOf(intArrayOf(255, 255, 253, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(250, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255)), arrayOf(intArrayOf(255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(254, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255), intArrayOf(255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255))))
    val probCoeffExtCat6 = intArrayOf(254, 254, 243, 230, 196, 177, 153, 140, 133, 130, 129)
    val probCoeffExtCat5 = intArrayOf(180, 157, 141, 134, 130)
    @JvmField
    val dc_qlookup = intArrayOf(4, 5, 6, 7, 8, 9, 10, 10, 11, 12, 13, 14, 15, 16, 17, 17, 18, 19, 20, 20,
            21, 21, 22, 22, 23, 23, 24, 25, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 37, 38, 39, 40, 41, 42,
            43, 44, 45, 46, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68,
            69, 70, 71, 72, 73, 74, 75, 76, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 91, 93, 95, 96, 98,
            100, 101, 102, 104, 106, 108, 110, 112, 114, 116, 118, 122, 124, 126, 128, 130, 132, 134, 136, 138, 140,
            143, 145, 148, 151, 154, 157)
    @JvmField
    val ac_qlookup = intArrayOf(4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23,
            24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
            51, 52, 53, 54, 55, 56, 57, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96,
            98, 100, 102, 104, 106, 108, 110, 112, 114, 116, 119, 122, 125, 128, 131, 134, 137, 140, 143, 146, 149,
            152, 155, 158, 161, 164, 167, 170, 173, 177, 181, 185, 189, 193, 197, 201, 205, 209, 213, 217, 221, 225,
            229, 234, 239, 245, 249, 254, 259, 264, 269, 274, 279, 284)
    @JvmField
    val zigzag = intArrayOf(0, 1, 4, 8, 5, 2, 3, 6, 9, 12, 13, 10, 7, 11, 14, 15)
}