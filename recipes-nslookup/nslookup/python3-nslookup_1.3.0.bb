
SUMMARY = "Sensible high-level DNS lookups in Python, using DNSpython resolver"
HOMEPAGE = "https://github.com/wesinator/pynslookup"
AUTHOR = "wesinator <>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=17b7a09fc92652962385c6c401b13de9"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/a8/df/dffb43e594699ce79a517adb24f43951bba74d7b67a8f21282c43baf312d/nslookup-1.3.0.tar.gz"
SRC_URI[md5sum] = "49a82bd12824a799b5132d2fc864bde4"
SRC_URI[sha256sum] = "17e8dda04e8259d5a9edf4e641dd1cbffe36b579eee579c11c15db8b81a3b132"

S = "${WORKDIR}/nslookup-1.3.0"

DEPENDS += " "
RDEPENDS_${PN} = "python3-dnspython"

BBCLASSEXTEND = "native nativesdk"
