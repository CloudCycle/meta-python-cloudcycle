
SUMMARY = "McCabe checker, plugin for flake8"
HOMEPAGE = "https://github.com/pycqa/mccabe"
AUTHOR = "Tarek Ziade <tarek@ziade.org>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a489dc62bacbdad3335c0f160a974f0f"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/e7/ff/0ffefdcac38932a54d2b5eed4e0ba8a408f215002cd178ad1df0f2806ff8/mccabe-0.7.0.tar.gz"
SRC_URI[md5sum] = "374ee2b9407546bb41d195e7436e5f62"
SRC_URI[sha256sum] = "348e0240c33b60bbdf4e523192ef919f28cb2c3d7d5c7794f74009290f236325"

S = "${WORKDIR}/mccabe-0.7.0"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
