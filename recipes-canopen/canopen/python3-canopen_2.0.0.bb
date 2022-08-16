
SUMMARY = "CANopen stack implementation"
HOMEPAGE = ""
AUTHOR = "Christian Sandberg <christiansandberg@me.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=97f135a6ee6f800c377b5512122c7a8d"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/9e/d6/6ced4b410b904aeee5f7d0227187eae95a5ad769f01014a74fc0e016845e/canopen-2.0.0.tar.gz"
SRC_URI[md5sum] = "0719b73bd8ccaeaa9fb758c5338fd030"
SRC_URI[sha256sum] = "bcc8aa9ea83f7ada5da0dade81038977be52a93802c2657649729eb1f82065d9"

S = "${WORKDIR}/canopen-2.0.0"

DEPENDS += " "
RDEPENDS_${PN} = "python3-python-can"

BBCLASSEXTEND = "native nativesdk"
