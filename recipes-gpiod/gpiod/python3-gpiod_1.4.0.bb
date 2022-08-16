
SUMMARY = ""
HOMEPAGE = "https://github.com/hhk7734/python3-gpiod"
AUTHOR = "Hyeonki Hong <hhk7734@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f96212d9a01c399ef62bedbbba921089"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/7b/3c/a0b4eec9f915df26981ff93b8cc350bb23106c115413d99851d459be2fed/gpiod-1.4.0.tar.gz"
SRC_URI[md5sum] = "bcdbb948245ac1afebc70600ac1bb5fb"
SRC_URI[sha256sum] = "0b07cd3454c0ae42ce155320a2300a81eea09dd9d74f7b4c36e15532846d40c0"

S = "${WORKDIR}/gpiod-1.4.0"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
