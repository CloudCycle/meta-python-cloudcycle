
SUMMARY = "serialize all of python"
HOMEPAGE = "https://github.com/uqfoundation/dill"
AUTHOR = "Mike McKerns <mmckerns@uqfoundation.org>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=61f24e44fc855bde43ed5a1524a37bc4"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/59/46/634d5316ee8984e7dac658fb2e297a19f50a1f4007b09acb9c7c4e15bd67/dill-0.3.5.1.tar.gz"
SRC_URI[md5sum] = "3f8757f3aaa394efa67764624ab87cfd"
SRC_URI[sha256sum] = "d75e41f3eff1eee599d738e76ba8f4ad98ea229db8b085318aa2b3333a208c86"

S = "${WORKDIR}/dill-0.3.5.1"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
