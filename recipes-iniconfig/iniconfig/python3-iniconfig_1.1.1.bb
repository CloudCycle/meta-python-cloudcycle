
SUMMARY = "iniconfig: brain-dead simple config-ini parsing"
HOMEPAGE = "http://github.com/RonnyPfannschmidt/iniconfig"
AUTHOR = "Ronny Pfannschmidt, Holger Krekel <opensource@ronnypfannschmidt.de, holger.krekel@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a6bb0320b04a0a503f12f69fea479de9"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/23/a2/97899f6bd0e873fed3a7e67ae8d3a08b21799430fb4da15cfedf10d6e2c2/iniconfig-1.1.1.tar.gz"
SRC_URI[md5sum] = "0b7f3be87481211c183eae095bcea6f1"
SRC_URI[sha256sum] = "bc3af051d7d14b2ee5ef9969666def0cd1a000e121eaea580d4a313df4b37f32"

S = "${WORKDIR}/iniconfig-1.1.1"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
