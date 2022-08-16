
SUMMARY = "A small Python module for determining appropriate platform-specific dirs, e.g. a "user data dir"."
HOMEPAGE = ""
AUTHOR = " <>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=282c970bb844954c8535dd6e9733db7f"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/ff/7b/3613df51e6afbf2306fc2465671c03390229b55e3ef3ab9dd3f846a53be6/platformdirs-2.5.2.tar.gz"
SRC_URI[md5sum] = "2301a8a29c3082a49ee293073d893887"
SRC_URI[sha256sum] = "58c8abb07dcb441e6ee4b11d8df0ac856038f944ab98b7be6b27b2a3c7feef19"

S = "${WORKDIR}/platformdirs-2.5.2"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
