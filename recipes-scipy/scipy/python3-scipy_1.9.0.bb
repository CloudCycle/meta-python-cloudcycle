
SUMMARY = "SciPy: Scientific Library for Python"
HOMEPAGE = "https://www.scipy.org"
AUTHOR = " <>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSES_bundled.txt;md5=073727dfa31088e61a9a578b17ae8829"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/a8/e3/4ec401f609d34162b7023a09165da491630879e4cfa2336667fe2102cd06/scipy-1.9.0.tar.gz"
SRC_URI[md5sum] = "1f2e527930ddfa15a622b146dae42144"
SRC_URI[sha256sum] = "c0dfd7d2429452e7e94904c6a3af63cbaa3cf51b348bd9d35b42db7e9ad42791"

S = "${WORKDIR}/scipy-1.9.0"

DEPENDS += " "
RDEPENDS_${PN} = "python3-numpy"

BBCLASSEXTEND = "native nativesdk"
