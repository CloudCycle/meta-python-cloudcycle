
SUMMARY = "An abstract syntax tree for Python with inference support."
HOMEPAGE = ""
AUTHOR = " <Python Code Quality Authority <code-quality@python.org>>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a70cf540abf41acb644ac3b621b2fad1"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/3e/0c/ad6130b5164ea71c8fa1b2ffc1195c8ef6b7141e2628725a47ac9e703657/astroid-2.12.0.tar.gz"
SRC_URI[md5sum] = "111769d83f59da5b0770cbef5e5ce282"
SRC_URI[sha256sum] = "94f197d1b3dcffe636aaa3bd5bbb0da32f9a68d6cbfe69a7e65a72bbe702afc1"

S = "${WORKDIR}/astroid-2.12.0"

DEPENDS += " "
RDEPENDS_${PN} = "python3-lazy-object-proxy python3-wrapt"

BBCLASSEXTEND = "native nativesdk"
