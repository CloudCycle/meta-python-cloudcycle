
SUMMARY = "CRC Generator"
HOMEPAGE = "http://crcmod.sourceforge.net/"
AUTHOR = "Ray Buvel <rlbuvel@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f9a19291627cad2d1dfbfcf3c9fb85c2"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/6b/b0/e595ce2a2527e169c3bcd6c33d2473c1918e0b7f6826a043ca1245dd4e5b/crcmod-1.7.tar.gz"
SRC_URI[md5sum] = "2d5b92117d958dcead94f9e17f54cd32"
SRC_URI[sha256sum] = "dc7051a0db5f2bd48665a990d3ec1cc305a466a77358ca4492826f41f283601e"

S = "${WORKDIR}/crcmod-1.7"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
