<template>
  <div>
    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          plain
          icon="el-icon-plus"
          size="large"
          @click="handleAdd"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="el-icon-edit"
          size="large"
          @click="handleUpdate"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          plain
          icon="el-icon-delete"
          size="large"
          @click="handleDelete"
        >删除</el-button>
      </el-col>
    </el-row>

    <el-table v-loading="loading" :data="zfsList">
      <el-table-column prop="equipmentId" label="EquipmentId" :show-overflow-tooltip="true" width="200"></el-table-column>
      <el-table-column prop="displayName" label="DisplayName" width="200"></el-table-column>
      <el-table-column prop="remoteEquipmentId" label="remoteEquipmentId" width="200"></el-table-column>
      <el-table-column prop="remoteDisplayName" label="RemoteDisplayName" width="200"></el-table-column>
      <el-table-column prop="pmMode" label="PmMode" width="200"></el-table-column>
      <el-table-column prop="emptySize" label="EmptySize" :width="200"></el-table-column>
      <el-table-column prop="occupiedSize" label="OccupiedSize" :width="200"></el-table-column>
      <el-table-column prop="reservedSize" label="ReservedSize" :width="200"></el-table-column>
      <el-table-column prop="utilization" label="Utilization" :show-overflow-tooltip="true"></el-table-column>
    </el-table>

    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加学生对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="680px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="100px">
        <el-row>
          <el-col :span="24">
            <el-form-item label="id" prop="id">
              <el-input v-model="form.id" placeholder="请输入id" />
            </el-form-item>
          </el-col>
          <el-col :span="24">
            <el-form-item label="name" prop="name">
              <el-input v-model="form.name" placeholder="请输入name" />
            </el-form-item>
          </el-col>
          <el-col :span="24">
            <el-form-item label="age" prop="age">
              <el-input v-model="form.age" placeholder="请输入age" />
            </el-form-item>
          </el-col>
        </el-row>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>

    <!-- 删除学生对话框 -->
    <el-dialog :title="title" :visible.sync="open_del" width="680px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="100px">
        <el-row>
          <el-col :span="24">
            <el-form-item label="id" prop="id">
              <el-input v-model="form.id" placeholder="请输入id" />
            </el-form-item>
          </el-col>
        </el-row>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm_del">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>

    <!-- 修改学生对话框 -->
    <el-dialog :title="title" :visible.sync="open_upd" width="680px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="100px">
        <el-row>
          <el-col :span="24">
            <el-form-item label="id" prop="id">
              <el-input v-model="form.id" placeholder="请输入id" />
            </el-form-item>
          </el-col>
          <el-col :span="24">
            <el-form-item label="name" prop="name">
              <el-input v-model="form.name" placeholder="请输入name" />
            </el-form-item>
          </el-col>
          <el-col :span="24">
            <el-form-item label="age" prop="age">
              <el-input v-model="form.age" placeholder="请输入age" />
            </el-form-item>
          </el-col>
        </el-row>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm_upd">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>


  </div>
</template>

<script>
import {update, save, list, remove} from "@/api/zfs/menu";


export default {
  name: "Post",
  dicts: ['sys_normal_disable'],
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // 用户表格数据
      userList: null,
      //学生表格数据
      zfsList: null,
      // 弹出层标题
      title: "",
      // 部门树选项
      deptOptions: undefined,
      // 是否显示弹出层
      open: false,
      open_del:false,
      open_upd:false,
      // 部门名称
      deptName: undefined,
      // 默认密码
      initPassword: undefined,
      // 日期范围
      dateRange: [],
      // 岗位选项
      postOptions: [],
      // 角色选项
      roleOptions: [],
      // 表单参数
      form: {},
      defaultProps: {
        children: "children",
        label: "label"
      },
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10
      },
      // 列信息

      columns: [
        { key: 0, label: `equipmentId`, visible: true },
        { key: 1, label: `displayName`, visible: true },
        { key: 2, label: `emptySize`, visible: true },
        { key: 3, label: `occupiedSize`, visible: true },
        { key: 4, label: `reservedSize`, visible: true },
        { key: 5, label: `utilization`, visible: true }
      ],
      // 表单校验
      rules: {
        name: [
          { required: true, message: "学生name不能为空", trigger: "blur" },
          { min: 2, max: 20, message: '用户名称长度必须介于 2 和 20 之间', trigger: 'blur' }
        ],
        id: [
          { required: true, message: "学生id不能为空", trigger: "blur" }
        ],
        age: [
          { required: true, message: "学生age不能为空", trigger: "blur" }
        ]
      }
    };
  },


  created() {
    this.getList();
  },
  methods: {
    /** 查询菜单列表 */
    getList() {
      this.loading = true;
      list(this.queryParams).then(response => {
        this.zfsList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.open_del = false;
      this.open_upd = false;
      this.reset();
    },

    // 表单重置，生成子页面
    reset() {
      this.form = {
        Id: undefined,
        Name:undefined,
        Age:undefined,
      };
      this.resetForm("form");
    },

    /** 提交按钮 */
    submitForm: function() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          save(this.form).then(response => {
            this.$modal.msgSuccess("新增成功");
            this.open = false;
            this.getList();
          });
        }
      });
    },
    /** 删除按钮 */
    submitForm_del: function() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          remove(this.form).then(response => {
            this.$modal.msgSuccess("删除成功");
            this.open = false;
            this.getList();
          });
        }
      });
    },
    /** 修改按钮 */
    submitForm_upd: function() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          update(this.form).then(response => {
            this.$modal.msgSuccess("修改成功");
            this.open = false;
            this.getList();
          });
        }
      });
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "新增学生";
    },
    /** 修改按钮操作 */
    handleUpdate() {
      this.reset();
      this.open_upd = true;
      this.title = "更改学生";
    },
    /** 删除按钮操作 */
    handleDelete() {
      this.reset();
      this.open_del = true;
      this.title = "删除学生";
    },

  },
};
</script>
